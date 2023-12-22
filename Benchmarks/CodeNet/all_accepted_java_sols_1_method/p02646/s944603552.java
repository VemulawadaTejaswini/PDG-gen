import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long A = Long.parseLong(sc.next());
		long V = Long.parseLong(sc.next());
		long B = Long.parseLong(sc.next());
		long W = Long.parseLong(sc.next());
		long T = Long.parseLong(sc.next());

		if(V-W == 0) {
			System.out.println("NO");
			return;
		}

		if(B>A && B<0) {
			System.out.println(Math.abs(B+A) <= (V-W)* T ? "YES":"NO");
		} else if(A>B && A<0) {
			System.out.println(Math.abs(B+A) <= (W-V)* T ? "YES":"NO");
		}else if(B>A) {
			System.out.println((B-A) <= (V-W)* T ? "YES":"NO");
		} else {
			System.out.println((A-B) <= (V-W)* T ? "YES":"NO");
		}
	}
}
