import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {

			while (true) {
				int a = sc.nextInt(); //第一入力
				int b = sc.nextInt(); //第二入力
				char output[][] = new char[a][b];
				if(a == 0 && b == 0) {
					break; //00のときループを抜ける
				}
				for(int i = 0; i < a; i++) {
					for(int j = 0; j < b; j++) {
						if(((1 <= i) && (i < a - 1)) && ((1 <= j) && (j < b - 1))){
							output[i][j] = '.';
						}else {
							output[i][j] = '#';
						}
						System.out.print(output[i][j]);
					}
					System.out.println(); //改行
				}
				System.out.println(); //改行
			}
		}
	}
}

