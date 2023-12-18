import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int total = sc.nextInt();
		int odd = 0, even = 0;
		if(total == 1){
			System.out.println("YES");
		}
		for (int i = 0; i < total; i++) {
			if (sc.nextInt() % 2 == 0) {
				even++;
			} else {
				odd++;
			}
		}
		if (odd % 2 != 0) {
			System.out.println("NO");
		} else {
			System.out.println("YES");
		}
	}
}