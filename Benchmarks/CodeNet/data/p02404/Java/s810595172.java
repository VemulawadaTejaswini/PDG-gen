import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H;
		int W;
		StringBuilder sb = new StringBuilder();
		
		while (true) {
			H = sc.nextInt();
			W = sc.nextInt();
			
			//0 0?????????
			if (H ==0 && W ==0) {
				break;
			}
			

			for (int i = 0; i < H; i++) {
				for (int j = 0; j < W; j++) {
					if(i==0 || i==H-1 || j==0 || j==W-1){
						sb.append("#");
					}
					else {
						sb.append(".");
					}
				}
				//?¬??????????????????????
				sb.append("\n");
			}
			//??????
			System.out.println(sb);
		}
	}
}