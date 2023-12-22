import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {

			// 椅子の長さ
			int chair = sc.nextInt();
			// 人の幅
			int human = sc.nextInt();
			// 隙間
			int gap = sc.nextInt();

			// 座れる人数
			int ans = 0;
			int set = human + gap;
			if(chair % set >= gap){
				// 隙間を開けて座れる
				ans = chair / set;
			} else {
				// 隙間を開けて座れない
				ans = chair / set - 1;
			}
			System.out.println(ans);
		}

	}

}
