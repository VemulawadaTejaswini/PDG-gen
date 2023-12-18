import java.util.*;
class Main {
	static boolean[][] map;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int n = sc.nextInt();
			if(n == 0) break;
			map = new boolean[5011][5];
			for(int i = 0; i < n; i++) {
				int d = sc.nextInt();
				int p = sc.nextInt();
				int q = sc.nextInt();
				
				if(d == 1) {
					for(int j = 0; j < p; j++) {
						map[5010][j + q -1] = true;
					}
					IN:for(int j = 5009; j >= 0; j--) {
						for(int k = 0; k < p; k++) {
							if(map[j][k + q -1])break IN;
						}
						for(int k = 0; k < p; k++) {
							map[j  ][k + q - 1] = true;
							map[j+1][k + q - 1] = false;
						}
					}
				}
				else {
					for(int j = 0; j < p; j++) {
						map[5010 - j][q-1] = true;
					}
					for(int j = 5010 - p; j >= 0; j--) {
						if(map[j][q-1]) break;
						map[j][q-1] = true;
						map[j + p][q-1] = false;
						
					}
					
				}
				while(erase());
			}
			int count = 0;
			
			for(int i = 0; i < 5011; i++) {
				for(int j = 0; j < 5; j++) {
					if(map[i][j]) count++;
				}
			}
			System.out.println(count);
		}
	}

	static boolean erase() {
		boolean ret = false;
		for(int i = 0; i < 5010; i++) {
			for(int j = 0; j < 5; j++) {
				if(!map[i][j]) break;
				if(j == 4) {
					ret = true;
					for(int k = 0; k < 5; k++) {
						map[i][k] = false;
					}
					if(i != 5010) {
						for(int l = i; l < 5009; l++)
						for(int k = 0; k < 5; k++) {
							map[l][k] = map[l+1][k];
						}
					}
				}
			}
		}
		return ret;
	}
	
	static void show() {
		for(int i = 5; i >= 0; i--) {
			for(int j = 0; j < 5; j++) {
				System.out.print(" " + map[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}
}