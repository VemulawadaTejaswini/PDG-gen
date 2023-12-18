import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true) {
			int H = scan.nextInt();
			int W = scan.nextInt();
			if(H == 0 && W == 0) {
				break;
			}
			StringBuilder sb = new StringBuilder();
			for(int i = 0; i < W; i++) {
				sb.append("#");
			}
			for(int i = 0; i < H; i++) {
				System.out.println(sb.toString());
			}
			System.out.println();
		}
		scan.close();
	}
}
