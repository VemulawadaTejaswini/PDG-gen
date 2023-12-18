import java.util.*;
import static java.lang.Math.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] xyh = new int[3*n];
		for (int i=0; i<n; i++) {
			xyh[i*3] = sc.nextInt();
			xyh[i*3+1] = sc.nextInt();
			xyh[i*3+2] = sc.nextInt();
		}

		for (int i=0; i<=100; i++) {
			for (int j=0; j<=100; j++) {
				int h = 0;
				for (int k=0; k<n; k++) {
					if (xyh[k*3+2] != 0) {
						h = Math.abs(i-xyh[k*3]) + Math.abs(j-xyh[k*3+1]) + xyh[k*3+2];
					}
				}

				boolean ok = true;
				for (int k=0; k<n; k++) {
					int dx = Math.abs(i-xyh[k*3]);
					int dy = Math.abs(j-xyh[k*3+1]);
					if (xyh[k*3+2] == 0) {
						if (h > dx + dy) {
							ok = false;
							break;
						}
					} else if (h != dx + dy + xyh[k*3+2]) {
						ok = false;
						break;
					}
				}

				if (ok) {
					System.out.println(i + " " + j + " " + h);
					return;
				}
			}
		}
	}
}