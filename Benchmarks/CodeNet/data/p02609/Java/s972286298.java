import java.util.*;
import java.util.Scanner;

public class Main{
	
	static int n;
	static long x;
	static int[] pc;
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		String sx=sc.next();
		x=0;//10進数標記のn
		int pop=0;
		
		for(int i=0;i<n;i++) {
			if(sx.charAt(i)=='1') {
				x+=Math.pow(2, n-i-1);
				pop++;
			}
		}
		
		pc=new int[(int) (x/2+1)];
		
		//calculate pop
		for(int i=1;i<=x/2;i++) {
			if(i==1) {
				pc[i]=1;
			}
			else {
				if(i%2==0)pc[i]=pc[i-1];
				else {
					pc[i]=pc[i-1]+1;
				}
			}
		}
		
		
		//System.out.println("x "+x +" pop "+pop);
		
		for(int i=0;i<n;i++) {
			int ans=0;
			long tx=x;
			int tp=pop;
			
			if(sx.charAt(i)=='0') {
				tp++;
				tx+=(long)Math.pow(2, n-i-1)%tp;
				
			}else {
				tp--;
				tx-=(long)Math.pow(2, n-i-1)%tp;
				
			}
			//System.out.println("tx "+tx);
			while(tx>0 && tp>1) {
				tx%=tp;
				tp=pc[(int) tx];
				ans++;
			}
			
			System.out.println(ans);
			
		}
		
	
		
	}
	
	static int next(int n,int pop) {
		return n%pop;
	}
	
		
	
	
}
