import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x, s, y, i, j, ix, jx, iy, jy, max;
		while(true) {
			max = 0;
			x = sc.nextInt();
			y = sc.nextInt();
			s = sc.nextInt();
			if(x == 0 && y == 0 && s ==0) break;
			for(i = 1; i < s; i++) {
				for(j = 1; j < s; j++) {
					ix = ((i * 100) + (i * x)) / 100;
					jx = ((j * 100) + (j * x)) / 100;
					if(s == ix + jx) {
						iy = ((i * 100) + (i * y)) / 100;
						jy = ((j * 100) + (j * y)) / 100;
						if(max <= iy + jy) {
							max = iy + jy;
						}
					}
				}
			}
			System.out.println(max);
		}
		sc.close();
	}
}

/*
5 8 105
8 5 105
1 2 24
99 98 24
12 13 26
1 22 23
1 13 201
13 16 112
2 24 50
1 82 61
1 84 125
1 99 999
99 1 999
98 99 999
1 99 11
99 1 12
0 0 0
*/
