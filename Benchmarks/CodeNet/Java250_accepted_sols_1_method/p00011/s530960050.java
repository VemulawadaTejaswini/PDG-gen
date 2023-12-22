import java.util.Scanner;

public class Main {
	private static Scanner scan;
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		scan.useDelimiter(",|\\s+");
		int a[] = new int[31];
		for(int i = 0;i < 31;i++){
			a[i] = i;
		}
		int w = scan.nextInt();
		int n = scan.nextInt();
		for(int i = 0;i < n;i++){			
			int a1 = scan.nextInt();
			int a2 = scan.nextInt();
			int b1 = a[a1];
			int b2 = a[a2];
			a[a1] = b2;
			a[a2] = b1;
		}
		for(int i = 1;i <= w;i++ ){
			System.out.println(a[i]);
		}
		System.exit(0);
	}
}