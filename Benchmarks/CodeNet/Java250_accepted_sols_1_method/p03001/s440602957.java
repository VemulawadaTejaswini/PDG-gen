import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double W = 0;
		double H = 0;
		double x = 0;
		double y = 0;
		Scanner sc = new Scanner(System.in);
		W = Integer.parseInt(sc.next());
		H = Integer.parseInt(sc.next());
		x = Integer.parseInt(sc.next());
		y = Integer.parseInt(sc.next());
		int flag = 0;
		if (W / 2 == x && H / 2 == y)
			flag = 1;
		System.out.println(W * H / 2 + " " + flag);
		sc.close();
	}

}