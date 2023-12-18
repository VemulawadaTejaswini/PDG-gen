import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x1 = in.nextInt();
		int y1 = in.nextInt();
		int x2 = in.nextInt();
		int y2 = in.nextInt();
		int x3 = x2-y2+y1;
		int y3 = y2+x2-x1;
		int x4 = x1-y2+y1;
		int y4 = y1+x2-x1;
		System.out.println(x3+" "+y3+" "+x4+" "+y4);

	}

}
