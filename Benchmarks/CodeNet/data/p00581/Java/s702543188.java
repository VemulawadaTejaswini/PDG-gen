import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int h = sc.nextInt();
			int w = sc.nextInt();
			int pointer = 0;
			int[][] map_J = new int[h*w][2];
			int[] map_O = new int[h*w];
			int[] map_I = new int[h*w];

			String s;
			char[] c;
			for (int i=0; i<h; i++) {
				s = sc.next();
				c = s.toCharArray();
				for (int j=0; j<w; j++) {
					switch(c[j]) {
					case 'J':
						map_J[pointer][0] = i;
						map_J[pointer][1] = j;
						pointer++;
						break;
					case 'O':
						if (j>0) {
							map_O[i*w+j] = 1;
							for (int k=i*w; k<i*w+j; k++) map_O[k]++;
						}
						break;
					case 'I':
						if (i>0) {
							map_I[i*w+j] = 1;
							for (int k=0; k<i; k++) map_I[k*w+j]++;
						}
						break;
					}
				}
			}
			long sum = 0;
			for (int i=0; i<pointer; i++) {
				int posit = map_J[i][0]*w+map_J[i][1];
				sum += map_O[posit]*map_I[posit];
			}
			System.out.println(sum);
		}
	}
}
