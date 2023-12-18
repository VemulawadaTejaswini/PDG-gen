import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if (a == 0 && b == 0){
			return;
		}
		while (true) {
			boolean f = true;
			for (int i = a; i <= b; i++) {
				if (i % 400 == 0 || (i % 100 != 0 && i % 4 == 0)) {
					f = false;
					System.out.println(i);
				}
			}
			if(f)System.out.println("NA");
			a = sc.nextInt();
			b = sc.nextInt();
			if (a == 0 && b == 0) {
				break;
			} else {
				System.out.println();
			}
		}
	}
}