import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int animal = sc.nextInt();
		int legs = sc.nextInt();
		boolean flag = true;
		if (legs > animal * 4) {
			System.out.println("No");
			return;
		} else if (legs % 2 > 0) {
			System.out.println("No");
			return;
		} else {

			for (int i = 0; i <= animal; i++) {
				if (i*4 + (animal - i) * 2 == legs ) {
					System.out.println("Yes");
					return;

				}else {
					flag = false;
				}
			}
			if(flag == false) {
				System.out.println("No");
			}
		}

	}
}
