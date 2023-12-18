import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc	=	new Scanner(System.in);
		int m, f, r, total;

		while(true) {
			m	=	sc.nextInt();
			f	=	sc.nextInt();
			r	=	sc.nextInt();

			total = m + f;

			if			(m == -1 && f == -1 && r == -1) {
				break;
			} else if	(m == -1 || f == -1 || total < 30) {
				System.out.println("F");
			} else if	(total >= 80) {
				System.out.println("A");
			} else if	(total >= 65 && total < 80) {
				System.out.println("B");
			} else if	(total >= 50 && total < 65) {
				System.out.println("C");
			} else if	(total >= 30 && total < 50) {
				if 		(r >= 50) {
					System.out.println("C");
				} else {
					System.out.println("D");
				}
			}
		}

		sc.close();

	}
}

