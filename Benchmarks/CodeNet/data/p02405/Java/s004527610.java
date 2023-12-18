import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			while (true) {
				boolean chikachika = true; //点滅するフラグ
				int a = sc.nextInt(); //第一入力
				int b = sc.nextInt(); //第二入力
				char output[][] = new char[a][b]; //二次元配列作成
				if(a == 0 && b == 0) {
					break; //00のときループを抜ける
				}
				for(int i = 0; i < a; i++) {
					for(int j = 0; j < b; j++) {
						if(chikachika){
							output[i][j] = '#';
						}else {
							output[i][j] = '.';
						}
						chikachika = !chikachika; //点滅
						System.out.print(output[i][j]);
					}
					System.out.println(); //改行
					if(b % 2 == 0) {
						chikachika = !chikachika; //偶数の場合フラグ変更
					}
				}
				System.out.println(); //改行
			}
		}
	}
}

