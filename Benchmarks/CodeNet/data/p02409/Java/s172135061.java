import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int person[][][] = new int[4][3][10];
		
		try (Scanner sc = new Scanner(System.in);) {
			
			int n = sc.nextInt();
			
			for(int i = 0; i < n; i++) {
				int b = sc.nextInt();
				int f = sc.nextInt();
				int r = sc.nextInt();
				int v = sc.nextInt();
				
				person[b -1][f - 1][r - 1] += v;
			}
			
			StringBuilder sb = new StringBuilder();
			
			for(int i = 0; i < 4; i++) {
				for(int j = 0; j < 3; j++) {
					for(int k = 0; k < 10; k++) {
						sb.append(" ");
						sb.append(person[i][j][k]);
					}
					if(!(i == 3 && j == 2)) {
						sb.append("\n");
					}
				}
				if(i < 3) {
					sb.append("####################");
					sb.append("\n");
				}
			}
			
			System.out.println(sb.toString());
		}
	}
}
