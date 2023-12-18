import java.awt.Point;
import java.io.FileInputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;
 
public class Main {
     
    static int a, b, n;
	
    private static int[] primetable(int max)
    {
    	int[] ret = new int[max + 1];
    	int loop;
    	
    	for (int i = 0; i < max + 1; i++) ret[i] = 1;
    	ret[0] = ret[1] = 0;
    	loop = (int)(Math.sqrt(max) + 1);
    	
    	for (int i = 2; i <= loop; i++) {
			if (ret[i] == 0) {
				continue;
			}
			for (int j = i*2; j < max+1; j+=i) {
				ret[j] = 0;
			}
		}
    	return ret;
    }
    
    static void start()
    {
    	int[] prime = primetable(1000000);
    	
    	int count = 0;
    	while (true) {
			if(prime[a] == 1) count++;
			if(n == count)
			{
				System.out.println(a);
				return;
			}
			a += b;
		}
    }
     
    public static void main(String[] args)
    {
        Scanner sca = new Scanner(System.in);
        
        while(true)
        {
        	a = sca.nextInt();
        	b = sca.nextInt();
        	n = sca.nextInt();
        	if(n == 0) break;
            
            start();
        }
        
    }
}