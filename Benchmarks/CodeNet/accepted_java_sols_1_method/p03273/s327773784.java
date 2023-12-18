import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt(); 
		int W = sc.nextInt();
		
		char[][] arr = new char[H][W];
		for (int i = 0; i < H; i++) {
			arr[i] = sc.next().toCharArray();
		}

		List<Integer> removeHList = new ArrayList<>();
		for (int i = 0; i < H; i++) {
			for (int j = 0; j < W; j++) {
				if (arr[i][j] == '#') {
					break;
				}
				if (j == W - 1) {
					removeHList.add(i);
				}
			}
		}
		
		List<Integer> removeWList = new ArrayList<>();
		for (int i = 0; i < W; i++) {
			for (int j = 0; j < H; j++) {
				if (arr[j][i] == '#') {
					break;
				}
				if (j == H - 1) {
					removeWList.add(i);
				}
			}
		}
		
		List<List<Character>> result = new ArrayList<>();
		for (int i = 0; i < H; i++) {
			if (removeHList.contains(i)) {
				continue;
			}
			List<Character> tempList = new ArrayList<>();
			for (int j = 0; j < W; j++) {
				if (removeWList.contains(j)) {
					continue;
				}
				tempList.add(arr[i][j]);
			}
			result.add(tempList);
		}
		
		for (int i = 0; i <result.size(); i++) {
			for (int j = 0; j < result.get(0).size(); j++) {
				System.out.print(result.get(i).get(j));
			}
			System.out.println();
		}
		sc.close();
	}
}
