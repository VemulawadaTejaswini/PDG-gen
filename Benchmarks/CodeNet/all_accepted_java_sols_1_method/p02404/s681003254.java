import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true) {
			int H = scan.nextInt();
			int W = scan.nextInt();
			if(H == 0 && W == 0) {
				break;
			}
			StringBuilder sb1 = new StringBuilder();
			StringBuilder sb2 = new StringBuilder();
			for(int i = 0; i < W; i++) {
				sb1.append("#");
				if(i == 0 || i == W - 1) {
					sb2.append("#");
				}else {
					sb2.append(".");
				}
			}
			for(int i = 0; i < H; i++) {
				if(i == 0 || i == H - 1) {
					System.out.println(sb1.toString());
				}else {
					System.out.println(sb2.toString());
				}
			}
			System.out.println();
		}
		scan.close();
	}
}
