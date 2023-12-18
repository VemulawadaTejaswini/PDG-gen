import java.*;
import java.io.*;
import java.util.*; 
 
public class Main
{
	public static void main(String args[]) throws Exception{
		new Main().run();
	}
	
	final int MAX = 500000;
	boolean dp[] = new boolean[MAX];
	int[] primes = new int[MAX];
	int count = 0;
	
	public void run()
	{
		int i,j;
		dp[0] = dp[1] = true;
		for(i=2;i<MAX;i++){
			if(!dp[i] && (i%7==1 || i%7==6)){
				primes[count++] = i;
				for(j=i+i;j<MAX;j+=i){
					dp[j] = true;
				}
			}
		}
		Scanner cin=new Scanner(System.in);
		while(true){
			int num = cin.nextInt();
			if(num==1) return;
			System.out.print(num + ":");
			boolean flag = false;
			for(i=0;i<count;i++){
				if(num%primes[i]==0){
					System.out.print(" " + primes[i]);
				}
			}
			System.out.println();
		}
	}
	
}