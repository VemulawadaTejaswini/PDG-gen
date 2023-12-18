import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int L = sc.nextInt();

		int A = sc.nextInt();

		int B = sc.nextInt();

		int C = sc.nextInt();

		int D = sc.nextInt();

		int a, b, e, ans;

		if(A%C==0) a = A/C;

		else a = A/C + 1;

		if(B%D==0) b = B/D;

		else b = B/D + 1;

		e = Math.max(a,b);

		ans = L - e;

		System.out.println(ans);
	}

}

