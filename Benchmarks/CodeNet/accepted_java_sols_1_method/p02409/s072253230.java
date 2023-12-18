import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int rooms = 10;
		int floors = 3;
		int buildings = 4;
		int seplength = 20;
		String sep = "#";
		String sepline = "";
		for (int i = 0; i < seplength; ++i)
			sepline += sep;
		int manager[][][] = new int[buildings][floors][rooms];
		Scanner sc = new Scanner(System.in);
		StringBuilder out = new StringBuilder();
		int n = sc.nextInt();
		for (int i = 0; i < n; ++i) {
			int b = sc.nextInt();
			int f = sc.nextInt();
			int r = sc.nextInt();
			int v = sc.nextInt();
			manager[b-1][f-1][r-1] += v;
		}
		for (int bi = 0; bi < buildings; ++bi) {
			if (bi > 0)
				out.append(sepline + "\n");
			for (int fi = 0; fi < floors; ++fi) {
				for (int ri = 0; ri < rooms; ++ri) {
					out.append(" " + manager[bi][fi][ri]);
				}
				out.append("\n");
			}
		}
		System.out.print(out);
	}
}
