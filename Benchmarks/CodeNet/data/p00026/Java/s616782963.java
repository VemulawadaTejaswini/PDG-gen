import java.util.Scanner;

public class Main {

	public static int[][] dropBig (int[][] paper, int x, int y) {
		paper = dropMid(paper,x,y);
		paper[y - 2][x] += 1;
		paper[y][x - 2] += 1;
		paper[y + 2][x] += 1;
		paper[y][x + 2] += 1;
		return paper;
	}

	public static int[][] dropMid (int[][] paper, int x, int y) {
		paper = dropSmall(paper,x,y);
		paper[y + 1][x + 1] += 1;
		paper[y + 1][x - 1] += 1;
		paper[y - 1][x + 1] += 1;
		paper[y - 1][x - 1] += 1;
		return paper;
	}

	public static int[][] dropSmall (int[][] paper, int x, int y) {
		paper[y][x] += 1;
		paper[y + 1][x] += 1;
		paper[y - 1][x] += 1;
		paper[y][x + 1] += 1;
		paper[y][x - 1] += 1;
		return paper;
	}

	public static int[][] sol (int[][] paper, String[] str) {
		int x = Integer.parseInt(str[0]) + 2;
		int y = Integer.parseInt(str[1]) + 2;
		int op = Integer.parseInt(str[2]);
		switch (op) {
			case 1 : paper = dropSmall(paper,x,y); break;
			case 2 : paper = dropMid(paper,x,y); break;
			case 3 : paper = dropBig(paper,x,y); break;
		}
		return paper;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int size = 10;
		int[][] paper = new int[size + 4][size + 4];

		while (sc.hasNextLine()) {
			String[] str = sc.nextLine().split(",");
			paper = sol(paper, str);
		}

		int countZero = 0, max = 0;
		for (int i = 2; i < paper.length - 2; i++) {
			for (int j = 2; j < paper[i].length - 2; j++) {
				if (paper[i][j] == 0) countZero++;
				max = Math.max(max, paper[i][j]);
			}
		}

		System.out.println(countZero + "\n" + max);

	}

}