import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int Alice = 0;
		int Bob = 0;
		
		int n = sc.nextInt();
		int [] a = new int[n];
		
		for(int i=0 ; i<n ; i++) {
			a[i] = sc.nextInt();
		}
		
		for(int j=n-1;j>0;j--) {
			for(int k=0;k<j;k++) {
				if(a[k]<a[k+1]) {
					int temp = a[k];
					a[k] = a[k+1];
					a[k+1] = temp;
				}
			}
		}
		
		for(int i=0 ; i<n ; i++) {
			if(i%2==0) Alice+=a[i];
			if(i%2==1) Bob+=a[i];
		}
		
		System.out.printf("%d\n",Alice-Bob);
	}
}
