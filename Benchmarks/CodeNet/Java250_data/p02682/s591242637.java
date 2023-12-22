import java.util.Scanner;



public class Main {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
		int c = Integer.parseInt(sc.next());
		int k = Integer.parseInt(sc.next());
		int sum = 0;

		int xa = Math.min(a,k);
		k -= xa;
		int xb = Math.min(b, k);
		k -= xb;
		int xc = k;
		sum = xa - xc;
		System.out.println(sum);


	}
}
