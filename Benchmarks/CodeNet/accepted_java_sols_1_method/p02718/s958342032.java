import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int m = scan.nextInt();
		int total = 0;
		int a[] = new int[n];
		
		for(int i=0;i<n;i++) {
			a[i] = scan.nextInt();
			total += a[i];
		}
		
		double border = (double)total/(double)(4*m);
		Arrays.sort(a);
		
		for(int i=n-1;i>n-1-m;i--) {
			if(a[i] < border) {
				System.out.println("No");
				System.exit(0);
			}else {
				continue;
			}
		}
		
		System.out.println("Yes");
		
	}	
}
