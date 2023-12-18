import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int x = scan.nextInt();
		int n = scan.nextInt();
		ArrayList<Integer> list = new ArrayList<Integer>();
		int abs = 99;
		int ans = 0;

		for(int i = 0;i < n;i++) {
			list.add(scan.nextInt());
		}

		for(int i = 1;i <= 100;i++) {
			if(!(list.contains(i))) {
				if(Math.abs(x - i) < abs) {
					abs = Math.abs(x - i);
					ans = i;
				}
			}
		}

		if(n == 0) {
			System.out.println(x);
		}else if(n == 100){
			System.out.println(0);
		}else {
			System.out.println(ans);
		}
	}
}
