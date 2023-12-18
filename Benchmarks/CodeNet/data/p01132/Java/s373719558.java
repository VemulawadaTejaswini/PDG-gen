import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int count = 0;
		while(true){
			int n = sc.nextInt();
			if(n==0) break;
			if(count!=0) System.out.println();
			
			int[] a = new int[4];
			for(int i=0;i<4;i++) a[i] = sc.nextInt();
			int sum = a[0]*10 + a[1]*50 + a[2]*100 + a[3]*500 - n;
			
			a[3] -= sum/500;
			sum %= 500;
			a[2] -= sum/100;
			sum %= 100;
			a[1] -= sum/50;
			sum %= 50;
			a[0] -= sum/10;
			
			if(a[0]>0) System.out.println("10 " + a[0]);
			if(a[1]>0) System.out.println("50 " + a[1]);
			if(a[2]>0) System.out.println("100 " + a[2]);
			if(a[3]>0) System.out.println("500 " + a[3]);
			count++;
		}	
	}	
}