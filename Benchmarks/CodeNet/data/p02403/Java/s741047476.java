import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			while (true) {
				int a = sc.nextInt(); //第一入力
				int b = sc.nextInt(); //第二入力
				if(a == 0 && b == 0) {
					break;
				}
				for(int i = 0; i < a; i++) {
					for(int j = 0; j < b; j++) {
						System.out.print("#");
					}
					System.out.println("");
				}
				System.out.println();
			}
		}
	}
}


