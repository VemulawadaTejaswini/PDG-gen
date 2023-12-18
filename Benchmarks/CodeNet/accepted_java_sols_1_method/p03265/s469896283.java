import java.util.*;

class Main{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();

		int wid = x2 - x1;
		int heg = y2 - y1;

		System.out.print(x2 - heg + " ");
		System.out.print(y2 + wid + " ");
		System.out.print(x1 - heg + " ");
		System.out.println(y1 + wid);


	}
}