import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		int x_dis = x2-x1;
		int y_dis = y2-y1;
		int y3 = y2+x_dis;
		int x3 = x2-y_dis;
		int y4 = y1+x_dis;
		int x4 = x1-y_dis;
		System.out.println(x3+" "+y3+" "+x4+" "+y4);
	}
}