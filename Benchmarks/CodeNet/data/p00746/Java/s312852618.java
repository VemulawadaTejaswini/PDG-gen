import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		while (true) {
			int n = sc.nextInt();
			if (n == 0)
				break;

			// int maxw=0,maxh=0;
			HashMap<Integer, Masu2> list = new HashMap<Integer, Masu2>();
			int[][] map = new int[401][401];

			map[201][201] = 0;
		/*	for (int i = 0; i < 201; i++) {
				for (int j = 0; j < 201; j++) {
					map[i][j] = -1;
				}
			}*/
			Masu2 sub = new Masu2(201, 201);
			list.put(0, sub);

			int maxx = 201, maxy = 201, minx = 201, miny = 201;

			for (int i = 1; i < n; i++) {

				int nn = sc.nextInt();
				int dd = sc.nextInt();
				
				
				Masu2 desu = list.get(nn);
				int yy = desu.y;
				int xx = desu.x;

				switch (dd) {
				case 0:
					xx--;
					break;
				case 1:
					yy++;
					break;
				case 2:
					xx++;
					break;
				case 3:
					yy--;
					break;
				}

				if (xx < minx)
					minx = xx;
				else if (xx > maxx)
					maxx = xx;
				if (yy < miny)
					miny = yy;
				else if (yy > maxy)
					maxy = yy;

				map[yy][xx] = i;
				Masu2 sub2 = new Masu2(yy, xx);
				list.put(i, sub2);
			}

			int height = maxy - miny + 1;
			
			int width = maxx - minx + 1;
			
//			System.out.println(maxy + " " + miny);
//			System.out.println(maxx + " " + minx);
			System.out.println(width + " " + height);
	/*		
			for(int i=180;i<220;i++){
				for(int j=180;j<220;j++){
					System.out.print(map[i][j]+" ");
				}
				System.out.println();
			}
		*/	
		}
	}

}

class Masu2 {
	int y;
	int x;

	public Masu2(int y, int x) {
		this.x = x;
		this.y = y;
	}
}