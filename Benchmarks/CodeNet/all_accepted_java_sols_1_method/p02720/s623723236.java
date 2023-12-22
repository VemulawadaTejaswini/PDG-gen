import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
public class Main {
	public static void main(String[] args)throws Exception{
		Scanner stdIn=new Scanner(System.in);
		int K=stdIn.nextInt();
		Deque <Long> Q=new ArrayDeque<Long>();
		for(int i=1;i<=9;i++){
			Q.add((long)i);
		}
		for(int i=0;i<K;i++){
			long x=Q.poll();
			if(i==K-1){
				System.out.println(x);
				System.exit(0);
			}
			if(x%10!=0)
				Q.add(x*10+(x%10-1));
			Q.add(x*10+(x%10));
			if(x%10!=9)
				Q.add(x*10+(x%10+1));
		}
	}
}
