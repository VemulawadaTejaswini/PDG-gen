import java.io.InputStreamReader; 
import java.io.BufferedReader;
import java.io.IOException;

class Main {
	public static void main(String[] args) throws IOException {
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader bf = new BufferedReader(is);
		while (true) {
			String[] strAry = bf.readLine().split(" ");
			int h = Integer.parseInt(strAry[0]);
			int w = Integer.parseInt(strAry[1]);
			if (h == 0 && w == 0) {
				break;
			}
			for (int i = 1; i <= h; i++) {
				if (i % 2 != 0) {
					for (int j = 1; j <= w; j++) {
						if (j % 2 != 0) System.out.print("#");
						else  if (j % 2 == 0) System.out.print(".");	
						}
					} else if (i % 2 == 0) {
						for (int k = 1; k <= w; k++) {
						if (k % 2 != 0) System.out.print(".");
						else if (k % 2 == 0) System.out.print("#");
						}
					}
				System.out.println();
			}
			System.out.println();
		}
	}
}