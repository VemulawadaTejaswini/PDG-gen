import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws java.io.IOException {
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int n = scan.nextInt();
			int a[] = new int[n];
			int b[] = new int[n];
			int c[] = new int[n];
			for(int d = 0;d<n;d++){
				a[d] = scan.nextInt();
				b[d] = scan.nextInt();
				c[d] = scan.nextInt();
			}
			for(int e = 0;e<n;e++){
				int A = a[e]*a[e];
				int B = b[e]*b[e];
				int C = c[e]+c[e];
				if((A+B==C)||(B+C==A)||(C+A==B)){
					System.out.println("Yes");
				}else{
					System.out.println("No");
				}
			}
		}
	}
}