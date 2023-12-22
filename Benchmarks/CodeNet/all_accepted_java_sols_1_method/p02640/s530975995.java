

import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int X = sc.nextInt(); // 最小値は2X、最大値は4X
		int Y = sc.nextInt(); 
		
		// 最大値と最小値の間の足の総数は、偶数であれば任意で取り得る
		if(Y > 4*X || Y < 2*X || Y%2==1) {
			System.out.println("No");
		}else {
			System.out.println("Yes");
		}
		
	}
}

