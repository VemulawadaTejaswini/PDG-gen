import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try{
		Scanner sc = new Scanner(System.in);

		int h = sc.nextInt();
		int w = sc.nextInt();
		int[][] mass = new int[h][w];
		String line = sc.nextLine();

		for (int i = 0; i < h; i++) {
			line = sc.nextLine();
			for (int x = 0; x < w; x++) {
				if (line.charAt(x) == '#') {
					mass[i][x] = 1;
				}else{
					mass[i][x] = 0;
				}
			}
		}
		String ans = "Yes";

		for (int i = 0; i < h; i++) {
			for (int x = 0; x < w; x++) {
				if(mass[i][x] == 1){
				boolean yes = false;

				// 左のマス
				if (x != 0) {
					if (mass[i][x - 1] == 1)
						yes = true;
				}
				// 右のマス
				if (x != w - 1) {
					if (mass[i][x + 1] == 1)
						yes = true;
				}

				// 上のマス
				if (i != 0) {
					if (mass[i - 1][x] == 1)
						yes = true;
				}

				// 下のマス
				if (i != h - 1) {
					if (mass[i + 1][x] == 1)
						yes = true;
				}

				if (!yes) {
					ans = "No";
				}

				}
			}
		}

		System.out.println(ans);
		}catch(Exception e){
			e.printStackTrace();
		}

	}
}
