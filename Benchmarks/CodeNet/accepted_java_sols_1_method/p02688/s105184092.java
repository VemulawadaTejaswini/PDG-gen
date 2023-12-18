import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();
		int d;
		int a;;
		boolean[] b = new boolean[n+1];
		int count = 0;

		for(int i=1;i<=k;i++) {
			d = scan.nextInt();
			for(int j=1;j<=d;j++) {
				a = scan.nextInt();
				b[a] = true;
			}
		}

		for(int i=1;i<=n;i++) {
			if(!b[i]) {
				count++;
			}
		}
		System.out.println(count);

	}

}