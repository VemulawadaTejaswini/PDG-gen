import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] a = {1, 3, 5, 7, 8, 10,12};
		int [] b = {4, 6, 9, 11};
		int c = 2;
		int x = sc.nextInt();
		int y = sc.nextInt();
		int cx = 3;
		int cy = 3;
		for(int val : a) {
			if(val == x) {
				cx = 1;
			}
			if (val == y) {
				cy = 1;
			}
		}
		for(int valu : b) {
			if(valu == x) {
				cx = 2;
			}
			if(valu == y) {
				cy = 2;
			}
		}
		if(cx == cy) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}
