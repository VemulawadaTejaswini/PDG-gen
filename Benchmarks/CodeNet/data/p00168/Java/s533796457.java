import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] a = new int[31];
		a[1] = 1;
		a[2] = 2;
		a[3] = 4;
		for(int i=4;i<=30;i++) a[i] = a[i-1]+a[i-2]+a[i-3];
		
		while(true){
			int n = sc.nextInt();
			if(n==0) break;
			System.out.println(a[n]/3650+1);
		}	
	}	
}