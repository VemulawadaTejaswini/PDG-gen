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
		
		pc=new int[pop+2];
		
		//calculate pop
		int k=1;
		/*Loop: for(int i=1;i<=pop+1;) {
			for(int j=1;j<=k;j++) {
				if(i>pop)break Loop;
				pc[i]=j;
				System.out.println("j: "+j+" i: "+i+" pc[i]: "+pc[i]);
				i++;
			}
			k++;
		}*/
		for(int i=1;i<=pop+1;i++) {
			String bin = Integer.toBinaryString(i);
			int count=0;
			//System.out.println(bin);
			for(int j=0;j<bin.length();j++) {
				if(bin.charAt(j)=='1')count++;
			}
			pc[i]=count;
		}
		
		//System.out.println("x "+x +" pop "+pop);
		
		for(int i=0;i<n;i++) {
			int ans=0;
			long tx=x;
			int tp=pop;
			//System.out.println("tx "+tx+" tp "+tp);
			if(sx.charAt(i)=='0') {
				tp++;
				tx+=(long)Math.pow(2, n-i-1);
				
			}else {
				tp--;
				tx-=(long)Math.pow(2, n-i-1);
				
			}
			//System.out.println("n-i-1 "+ (n-i-1) +" tx "+tx+" tp "+tp);
			if(tx==0) {
				System.out.println(ans);
				continue;
			}
			while(tx>0 && tp>0) {
				tx%=tp;
				tp=pc[(int) tx];
				ans++;
			//System.out.println("tx "+tx+" tp "+tp+" ans "+ans);

			}
			//if(tp==1)ans++;
			
			System.out.println(ans);
			
		}
		
	
		
	}
	
	
}
