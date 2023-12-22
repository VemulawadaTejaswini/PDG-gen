import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		String[][] S = new String[H+2][W+2];
		for(int i = 1;i < H+1;i++) {
			String[] s = sc.next().split("");
			for(int j = 1;j < W+1;j++) {
				S[i][j] = s[j-1];
			}
		}
		sc.close();
		int[][] num = new int[H+2][W+2];
		for(int i = 1;i < H+1;i++) {
			for(int j = 1;j < W+1;j++) {
				if(S[i][j].equals("#")) {
					num[i-1][j-1]+=1;
					num[i-1][j]+=1;
					num[i-1][j+1]+=1;
					num[i][j-1]+=1;
					num[i][j+1]+=1;
					num[i+1][j-1]+=1;
					num[i+1][j]+=1;
					num[i+1][j+1]+=1;
				}
			}
		}
		StringBuilder sb =new StringBuilder();
		for(int i = 1;i < H+1;i++) {
			for(int j = 1;j < W+1;j++) {
				if(S[i][j].equals("#")) {
					sb.append(S[i][j]);
				}else {
					sb.append(num[i][j]);
				}
			}
			System.out.println(sb.toString());
			sb.delete(0, sb.length());
		}
	}
}