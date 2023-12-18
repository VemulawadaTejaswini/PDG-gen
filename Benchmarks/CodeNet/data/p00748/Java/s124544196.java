import java.awt.Point;
import java.io.FileInputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
 
public class Main {
     
	static int N;
	static int max;
	
	static void bfs1()
	{
		LinkedList<Integer> sum = new LinkedList<Integer>();
		LinkedList<Integer> num = new LinkedList<Integer>();
		LinkedList<Integer> index = new LinkedList<Integer>();
		
		for (int i = max; i >= 1; i--) {
			sum.offer(new Integer(0));
			num.offer(new Integer(i));
			index.offer(new Integer(1));
		}
		
		while (!sum.isEmpty()) {
			int ss = sum.poll().intValue();
			int nn = num.poll().intValue();
			int ii = index.poll().intValue();
			
			ss += nn * (nn + 1) * (nn + 2) / 6;
			if(ss == N)
			{
				System.out.print(ii);
				return;
			}
			if(ss > N) continue;
			if(ii == 1000) continue;
			for (int i = nn; i >= 1; i--) {
				if((ss+i * (i + 1) * (i + 2) / 6) > N) continue;
				sum.offer(new Integer(ss));
				num.offer(new Integer(i));
				index.offer(new Integer(ii+1));
			}
		}
	}
	
	static void bfs2()
	{
		LinkedList<Integer> sum = new LinkedList<Integer>();
		LinkedList<Integer> num = new LinkedList<Integer>();
		LinkedList<Integer> index = new LinkedList<Integer>();
		
		for (int i = max; i >= 1; i--) {
			if((i*(i+1)*(i+2)/6) % 2 == 0) continue;
			sum.offer(new Integer(0));
			num.offer(new Integer(i));
			index.offer(new Integer(1));
		}
		
		while (!sum.isEmpty()) {
			int ss = sum.poll().intValue();
			int nn = num.poll().intValue();
			int ii = index.poll().intValue();
			
			ss += nn * (nn + 1) * (nn + 2) / 6;
			if(ss == N)
			{
				System.out.print(ii);
				return;
			}
			if(ss > N) continue;
			if(ii == 1000) continue;
			for (int i = nn; i >= 1; i--) {
				if((i*(i+1)*(i+2)/6)%2 == 0) continue;
				if((ss+i * (i + 1) * (i + 2) / 6) > N) continue;
				sum.offer(new Integer(ss));
				num.offer(new Integer(i));
				index.offer(new Integer(ii+1));
			}
		}
	}
    
    static void start()
    {
    	for (max = 1; max < 200; max++) {
			if(N <= (max*(max+1)*(max+2)/6)) break;
		}
    	//System.out.print(max);
    	bfs1();
    	System.out.print(" ");
    	bfs2();
    	System.out.println("");
    }
     
    public static void main(String[] args)
    {
        Scanner sca = new Scanner(System.in);
        
        while(true)
        {
        	N = sca.nextInt();
        	
        	if(N == 0) break;
            
            start();
        }
        
    }
}