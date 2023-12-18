import java.util.Scanner;
class Main {
	int m, f, r, i, n;
	public void gr() {
		Scanner sc = new Scanner(System.in);
		m = sc.nextInt();
		f = sc.nextInt();
		r = sc.nextInt();
		while(m != -1 || f != -1 || r != -1) {
			if(m == -1 || f == -1) {
				System.out.println("F");
			} else if(m + f >= 80) {
				System.out.println("A");
			} else if(m + f >= 65) {
				System.out.println("B");
			} else if(m + f >= 50) {
				System.out.println("C");
			} else if(m + f >= 30) {
				if(r >= 50) {
					System.out.println("C");
				} else {
				System.out.println("D");
				}
			} else {
				System.out.println("F");
			}
			m = sc.nextInt();
			f = sc.nextInt();
			r = sc.nextInt();
		}
	}
	public static void main(String[] args) {
		new Main().gr();
	}
}