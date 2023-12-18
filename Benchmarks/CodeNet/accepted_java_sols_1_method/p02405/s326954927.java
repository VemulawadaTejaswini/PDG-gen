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
			StringBuilder sb = new StringBuilder();
			StringBuilder sb2 = new StringBuilder();
			for(int i = 0; i < W; i++) {
				if(i % 2 == 0) {
					sb.append("#");
					sb2.append(".");
				}else {
					sb.append(".");
					sb2.append("#");
				}
			}
			for(int i = 0; i < H; i++) {
				if(i % 2 == 0) {
					System.out.println(sb.toString());
				}else {
					System.out.println(sb2.toString());
				}
			}
			System.out.println();
		}
		scan.close();
	}
}
