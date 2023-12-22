import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();

		char[] a = stdIn.next().toCharArray();
		StringBuilder sb = new StringBuilder();
		StringBuilder sc = new StringBuilder();

		if(n %2!= 0) {
			System.out.println("No");
			System.exit(0);
		}

		for(int i = 0; i < a.length/2; i++) {
			sb.append(a[i]);
		}
		String sbb = sb.toString();
		for(int i= a.length/2;i<a.length;i++) {
			sc.append(a[i]);
		}
		String scc = sc.toString();

		if(sbb.equals(scc)) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}

	}

}
