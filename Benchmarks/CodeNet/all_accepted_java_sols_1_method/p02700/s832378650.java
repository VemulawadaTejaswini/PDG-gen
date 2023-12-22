import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = Integer.parseInt(sc.next());
		int B = Integer.parseInt(sc.next());
		int C = Integer.parseInt(sc.next());
		int D = Integer.parseInt(sc.next());
		sc.close();

		int taHP = A;
		int aoHP = C;

		while((taHP > 0) && (aoHP> 0)) {
			aoHP  = aoHP - B;
			if(aoHP <= 0) {
				System.out.println("Yes");
				break;
			}

			taHP = taHP - D;
			if(taHP <= 0) {
				System.out.println("No");
				break;
			}
		}

	}

}