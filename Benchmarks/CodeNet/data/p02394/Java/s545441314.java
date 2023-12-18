import java.util.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int W = sc.nextInt();
		int H = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		int r = sc.nextInt();
		boolean flag = false;
		if (x>=r && x<=W-r) {
			if (y>=r && y<=H-r) {
				flag = true;
			}
		}
		System.out.println(flag==true?"Yes":"No");
	}
}

