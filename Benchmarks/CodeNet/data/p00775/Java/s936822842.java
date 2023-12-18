import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	void doIt() {
		new Vampire().main();
	}

	class Vampire{
		final int MAX = Integer.MAX_VALUE;
		void main() {
			while(true) {
				int r = sc.nextInt();
				int n = sc.nextInt();
				if(n == 0 && r == 0)return;
				double ymin[] = new double[41];//xが整数
				double b[] = new double[40];//xが整数+0.5
				Arrays.fill(ymin, MAX);
				for(int i = 0; i < n; i++) {
					int left = sc.nextInt();
					int right = sc.nextInt();
					int h = sc.nextInt();
					
					for(int j = left; j < right; j++) {
						b[j + 20] = Math.max(b[j + 20], h);
					}
					
				}
				ymin[0] = b[0];
				ymin[40] = b[39];
				for(int i = -19; i < 20; i++) {
					ymin[i + 20] = Math.min(b[i + 19], b[i + 20]);
				}
				

				for(int i = -20; i <= 20; i++) {
					if(i <= -r || i >= r) {
						ymin[i + 20] = 21;
					}
					else {
						double x = Math.abs(i);
						double a = Math.acos(x /r);
						double diff = r * Math.sin(a);
						//System.out.println(x + " " + a + " " + diff);
						ymin[i + 20] -= diff;
					}
				}
				double min = 21.0;
				for(int i = 0; i < 41; i++) {
					min = Math.min(min, r + ymin[i]);
				}
				//System.out.println(Arrays.toString(ymin));
				System.out.println(Math.max(min, 0));
			}


		}
	}

	public static void main(String[] args) {
		new Main().doIt();
	}

}
