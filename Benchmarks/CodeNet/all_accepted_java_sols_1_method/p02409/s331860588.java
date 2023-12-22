import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		int[][] k_1 = new int[3][10];
		int[][] k_2 = new int[3][10];
		int[][] k_3 = new int[3][10];
		int[][] k_4 = new int[3][10];
		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			String[] strAry = br.readLine().split(" ");
			switch (strAry[0]) {
			case "1":
				k_1[Integer.parseInt(strAry[1]) - 1][Integer.parseInt(strAry[2]) - 1] += Integer.parseInt(strAry[3]);
				break;
			case "2":
				k_2[Integer.parseInt(strAry[1]) - 1][Integer.parseInt(strAry[2]) - 1] += Integer.parseInt(strAry[3]);
				break;
			case "3":
				k_3[Integer.parseInt(strAry[1]) - 1][Integer.parseInt(strAry[2]) - 1] += Integer.parseInt(strAry[3]);
				break;
			case "4":
				k_4[Integer.parseInt(strAry[1]) - 1][Integer.parseInt(strAry[2]) - 1] += Integer.parseInt(strAry[3]);
				break;
			}
		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 10; j++) {
				if (j == 9) System.out.println(" " + k_1[i][j]);
				else System.out.print(" " + k_1[i][j]);
			}
		}
		System.out.println("####################");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 10; j++) {
				if (j == 9) System.out.println(" " + k_2[i][j]);
				else System.out.print(" " + k_2[i][j]);
			}
		}
		System.out.println("####################");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 10; j++) {
				if (j == 9) System.out.println(" " + k_3[i][j]);
				else System.out.print(" " + k_3[i][j]);
			}
		}
		System.out.println("####################");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 10; j++) {
				if (i == 3 && j == 9)  System.out.print(" " + k_4[i][j]);
				else if (j == 9) System.out.println(" " + k_4[i][j]);
				else System.out.print(" " + k_4[i][j]);
			}
		}
	}
}