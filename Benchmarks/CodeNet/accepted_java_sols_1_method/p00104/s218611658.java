import java.util.Scanner;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int height = sc.nextInt();
			int width = sc.nextInt();
			if (height==0) {
				break;
			}
			char[][] tile = new char[width][height];
			boolean[][] moved = new boolean[width][height];
			for (int h=0;h<height;h++) {
				String line = sc.next();
				for (int w=0;w<width;w++) {
					tile[w][h] = line.charAt(w);
				}
			}
			int x = 0,y = 0;
			while(tile[x][y]!='.' && !moved[x][y]) {
				moved[x][y] = true;
				switch (tile[x][y]) {
				case '>':
					x++;
					break;
				case '^':
					y--;
					break;
				case '<':
					x--;
					break;
				case 'v':
					y++;
					break;
				}
			}
			if (tile[x][y]=='.') {
				System.out.println(x+" "+y);
			}else{
				System.out.println("LOOP");
			}
		}
	}
}