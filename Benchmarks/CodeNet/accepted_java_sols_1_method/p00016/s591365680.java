import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x = 0, y = 0;
		int dis = 0, dir = 90;
		String string;
		String[] strings;

		for(;;){
			string = sc.next();
			strings = string.split(",");
			if(string.equals("0,0")) break;

			dis = Integer.parseInt(strings[0]);

			x += dis * Math.cos(Math.toRadians(dir));
			y += dis * Math.sin(Math.toRadians(dir));

			dir += -Integer.parseInt(strings[1]);
		}

		System.out.printf("%d\n%d\n", (int)x, (int)y);
	}
}