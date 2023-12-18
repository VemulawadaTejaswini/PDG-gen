import java.util.Arrays;
import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n=scanner.nextInt();
		int m=scanner.nextInt();
		int X=scanner.nextInt();
		int Y=scanner.nextInt();
		int x[]=new int[n];
		int y[]=new int[m];
		for(int i=0;i<n;i++) {
			x[i]=scanner.nextInt();
		}
		Arrays.sort(x);
		for(int i=0;i<m;i++) {
			y[i]=scanner.nextInt();
		}
		Arrays.sort(y);
		for(int i=X+1;i<=Y;i++) {
			if(x[n-1]<i&&i<=y[0]) {
				System.out.println("No War");
				return;
			}
		}
		System.out.println("War");
	}
}
