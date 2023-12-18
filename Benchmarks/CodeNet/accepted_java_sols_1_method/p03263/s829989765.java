import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int H = sc.nextInt();
		int W = sc.nextInt();

		int[][] hw = new int[H][W];
		
		for (int i = 0; i < H; i++) {
			for (int j = 0; j < W; j++) {
				hw[i][j] = sc.nextInt();
			}
		}
		
		List<String> ansList = new ArrayList<>();
		int counter = 0;
		for (int i = 0; i < H; i++) {
			if (i == H - 1) {
				for (int j = 0; j < W; j++) {
					if (hw[i][j] % 2 == 1) {
						if (j != W - 1) {
							hw[i][j+1]++;
							hw[i][j]--;
							counter++;
							ansList.add((i+1) + " " + (j+1) + " " + (i+1) + " " + (j+2));
						}
					}
				}
			} else {
				for (int j = 0; j < W; j++) {
					if (hw[i][j] % 2 == 1) {
						hw[i+1][j]++;
						hw[i][j]--;
						counter++;
						ansList.add((i+1) + " " + (j+1) + " " + (i+2) + " " + (j+1));
					}
				}
			}
		}
		
		System.out.println(counter);
		for (int i = 0; i < counter; i++) {
			System.out.println(ansList.get(i));
		}
		
		sc.close();
		
		
		
	}
}
