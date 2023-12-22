import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i;
		int j;
		int k;
		int c=0;
		for( i = 0; i<n; i++) {
			for( j = 0; j<n; j++) {
				for( k = 0; k<n; k++) {
					c++;
				}
			}
		}
		System.out.println(c);
		sc.close();
		
	}
}
