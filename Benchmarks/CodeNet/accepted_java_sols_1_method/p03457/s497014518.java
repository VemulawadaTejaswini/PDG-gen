

import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, t = 0, x = 0, y = 0;
		boolean f=false;
		n = sc.nextInt();
		for (int i = 0, tt, tx, ty; i < n; i++) {
			tt = sc.nextInt();
			tx = sc.nextInt();
			ty = sc.nextInt();
			if ((Math.abs(tx - x) + Math.abs(ty - y)) % 2 != (tt - t) % 2// 判断奇偶性是否一样
					|| Math.abs(tx - x) + Math.abs(ty - y) > (tt - t)) {// 是否大于最短步数
				
				f=true;
			}
				t = tt;
				x = tx;
				y = ty;
			
		}
		if(f){
			System.out.println("No");
		}else
			System.out.println("Yes");

	}

}
