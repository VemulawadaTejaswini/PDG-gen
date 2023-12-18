import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);

	    int N = Integer.parseInt(scanner.next());
	    int a=N+N*N+N*N*N;



	    System.out.println(a);
	}

	public static int uclid(int m, int n) {
		if (m<n) {
			m ^= n;
			n^=m;
			m^=n;
		}

		while (true) {
			int t=m%n;
			if (t==0) {
				return n;
			} else {
				m=n;
				n=t;
			}
		}
	}

}