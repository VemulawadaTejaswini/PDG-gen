import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		String[] S = new String[H];
		for(int i = 0;i < H;++i)
			S[i] = sc.next();
		sc.close();
		
		int[][] mine = new int[W][H];
		for(int y = 0;y < H;++y) {
			for(int x = 0;x < W;++x) {
				if(S[y].charAt(x) == '#') {
					int ypro = y > 0 ? y-1 : y;
					int yter = y == H-1 ? y : y+1;
					int xpro = x > 0 ? x-1 : x;
					int xter = x == W-1 ? x : x+1;
					for(int yi = ypro;yi <= yter;++yi)
						for(int xi = xpro;xi <= xter;++xi)
							mine[xi][yi]++;
				}
			}
		}
		StringBuilder sb = new StringBuilder();
		for(int y = 0;y < H;++y) {
			for(int x = 0;x < W;++x) {
				if(S[y].charAt(x) == '#')
					sb.append('#');
				else
					sb.append(mine[x][y]);
			}
			sb.append('\n');
		}
		System.out.println(sb.toString());
	}
}
