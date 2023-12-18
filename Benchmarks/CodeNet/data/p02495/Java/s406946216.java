import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int w;
		int h;

		while (true){
			h = sc.nextInt();
			w = sc.nextInt();
			// ともに 0 なら終了
			if (w == 0 && h == 0){
				break;
			}

			// 出力
			for (int y = 0; y < h; y++){
				for (int x = 0; x < w; x++){
					if ((x + y) % 2 == 0){
						System.out.printf("#");
					}else{
						System.out.printf(".");
					}
				}
				System.out.printf("%n");
			}
			System.out.printf("%n");
		}
	}
}