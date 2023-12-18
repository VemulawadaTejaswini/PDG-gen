import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = Integer.parseInt(sc.next());
		int B = Integer.parseInt(sc.next());
		int C = Integer.parseInt(sc.next());
		sc.close();

		//整数CがAより大きく、Bより小さいときにYESを出力
		if((A <= C) && (C <= B)) {
			System.out.println("Yes\r\n" +
					"");
		}else {
			System.out.println("No\r\n" +
					"");
		}
	}
}