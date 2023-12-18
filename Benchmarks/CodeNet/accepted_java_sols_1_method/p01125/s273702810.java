import java.util.Scanner;

/**
 * Misterious Gems
 *  URL:http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=2000
 *
 * @author Igari Kazuya
 *
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n;
		while(true){
			int[][] map = new int[21][21];
			for(int i=0;i<21;i++){
				for(int j=0;j<21;j++){
					map[i][j] = 0;
				}
			}

			n = sc.nextInt();
			if(n == 0){
				break;
			}

			for(int i=0;i<n;i++){
				int x = sc.nextInt();
				int y = sc.nextInt();
				map[y][x] = 1;
			}

			n = sc.nextInt();

			int x=10;
			int y=10;
			int xx,yy;
			for(int i=0;i<n;i++){
				switch(sc.next().charAt(0)){
				case 'N':
					yy = 1;
					xx = 0;
					break;
				case 'E':
					xx = 1;
					yy = 0;
					break;
				case 'S':
					yy = -1;
					xx = 0;
					break;
				case 'W':
					xx = -1;
					yy = 0;
					break;
				default:
					xx = 0;
					yy = 0;
				}

				int next = sc.nextInt();
				for(int j=0;j<next;j++){
					x += xx;
					y += yy;

					map[y][x] = 0;
				}
			}

			int flag = 0;
			for(int i=0;i<21;i++){
				for(int j=0;j<21;j++){
					flag += map[i][j];
				}
			}

			if(flag == 0){
				System.out.println("Yes");
			}else{
				System.out.println("No");
			}
		}

	}

}