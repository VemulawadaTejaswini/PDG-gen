import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int i;
	
		int n=sc.nextInt();
		int a[] = new int[n];
		
		for(i=0; i<n; i++) {
			a[i]=sc.nextInt();
		}
		
		for(i=n-1; i>=0; i--) {
			if(i>0) System.out.printf("%s ", a[i]);
			else System.out.printf("%d", a[i]);
		}
		
		System.out.printf("\n");
		
	}
}

