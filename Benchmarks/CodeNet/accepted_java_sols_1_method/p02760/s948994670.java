import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] bingo = new int[3][3];
		boolean[][] check = new boolean[3][3];
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				bingo[i][j] = Integer.parseInt(sc.next());
				check[i][j] = false;
			}
		}
		int N = Integer.parseInt(sc.next());
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 0; i < N; i++) {
			list.add(Integer.parseInt(sc.next()));
		}
		sc.close();
		for(int i = 0; i < N; i++) {
			int tmp = list.get(i);
			for(int j = 0; j < 3; j++) {
				for(int k = 0; k < 3; k++) {
					if(tmp == bingo[j][k]) {
						check[j][k] = true;
					}
				}
			}
		}
		for(int i = 0; i < 3; i++) {
			if(check[i][0] && check[i][1] && check[i][2]) {
				System.out.println("Yes");
				return;
			}
			if(check[0][i] && check[1][i] && check[2][i]) {
				System.out.println("Yes");
				return;
			}
		}
		if(check[0][2] && check[1][1] && check[2][0]) {
			System.out.println("Yes");
			return;
		}else if(check[0][0] && check[1][1] && check[2][2]) {
			System.out.println("Yes");
			return;
		}else {
			System.out.println("No");
		}

	}

}