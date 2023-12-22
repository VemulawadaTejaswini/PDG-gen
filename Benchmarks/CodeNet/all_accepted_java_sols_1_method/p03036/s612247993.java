import java.util.Scanner;

//AtCoder Beginner Contest 127
//B	Algae
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int D = sc.nextInt();
		int x2000 = sc.nextInt();

		sc.close();

		int pre = x2000;
		for (int i = 0; i < 10; i++) {
			int ans = pre * r - D;
			System.out.println(ans);
			pre = ans;
		}

	}
}
