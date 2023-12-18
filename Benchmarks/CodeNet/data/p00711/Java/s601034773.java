import java.util.*;
import java.lang.*;
import java.math.*;

public class Main {
	Scanner sc = new Scanner(System.in);

	void run() {
		for (;;) {
			int w = sc.nextInt();
			int h = sc.nextInt();

			if ((w | h) == 0) {
				break;
			}

			int value[][] = new int[h][w];

			for (int i = 0; i < h; i++) {
				String buffer = sc.next();
				for (int j = 0; j < w; j++) {
					switch (buffer.charAt(j)) {
					case '.':
						value[i][j] = 1;
						break;
					case '@':
						value[i][j] = 2;
						break;
					}
				}
			}

			int dx[] = { -1, 1, 0, 0 };
			int dy[] = { 0, 0, 1, -1 };

			int z=0;
			int sum = 0;
			for (int c = 0; c < 403; c++) {
				z=0;
				for (int i = 0; i < h; i++) {
					for (int j = 0; j < w; j++) {
						if (value[i][j] == 2) {
							for (int k = 0; k < 4; k++) {
								int ni = i + dy[k];
								int nj = j + dx[k];

								if(ni < 0){
									continue;
								}
								if(ni >= h){
									continue;
								}
								if(nj < 0){
									continue;
								}
								if(nj >= w){
									continue;
								}
								if(value[ni][nj] == 1){
									value[ni][nj] = 2;
								}
							}
							value[i][j] = 3;
							z++;
						}
					}
				}
				sum += z;
				if(z == 0){
					break;
				}
			}
			System.out.println(sum);
		}

	}

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}
}