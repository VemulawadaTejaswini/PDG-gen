import java.util.Scanner;

	public class Main {

		public static void main(String[] args) {
			// AISing_C
			Scanner sc = new Scanner(System.in);

			int N = sc.nextInt();
			int x=0, y=0, z=0;
			int kai = 0;
			int cnt = 0;

			double maxVal = Math.sqrt(N);

			for(int k=1; k <= N; k++) {
				cnt = 0;
				for(x=1; x < maxVal; x++) {
					for(y=1; y <= x; y++) {
						for(z=1; z <= y; z++) {
							kai = x*x + y*y + z*z + x*y + y*z + z*x;
							if(kai == k) {
								if(x==y && y==z) {
									cnt++;
								} else {
									cnt += 3;
								}
							}
						}
					}
				}
				System.out.println(cnt);
			}

    	    // Scannerクラスのインスタンスをクローズ
    		sc.close();
    	}

    }