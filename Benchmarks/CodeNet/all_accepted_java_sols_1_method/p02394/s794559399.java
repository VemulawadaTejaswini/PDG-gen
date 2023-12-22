import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int kaisu = 5;
		int[] num = new int[kaisu];

		for(int i = 0; i < kaisu ; i++) {
			num[i] = scan.nextInt();
		}

		int wp = num[2]+num[4];
		int wm = num[2]-num[4];
		int hp = num[3]+num[4];
		int hm = num[3]-num[4];

		if(num[0] < wp | 0 > wm ) {
			System.out.println("No");
		}else if(num[1] < hp | 0 > hm) {
			System.out.println("No");
		}else System.out.println("Yes");
	}
}