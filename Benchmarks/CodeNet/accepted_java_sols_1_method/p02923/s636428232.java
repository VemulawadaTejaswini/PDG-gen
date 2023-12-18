import java.util.Scanner;

	public class Main {

		public static void main(String[] args) {
			// AtCoder_C
			Scanner sc = new Scanner(System.in);
			int ans = 0;

			int N = sc.nextInt();
			long now = sc.nextLong();
			long next = 0;

			int moveNow = 0;
			int moveMax = 0;

			for(int i=1; i<N; i++) {
				next = sc.nextLong();
				if(now >= next) {
					moveNow++;
				} else {
					if(moveMax < moveNow) {
						moveMax = moveNow;
					}
					moveNow = 0;
				}
				now = next;
			}

			if(moveMax < moveNow) {
				moveMax = moveNow;
			}

			System.out.println(moveMax);

    	    // Scannerクラスのインスタンスをクローズ
    		sc.close();
    	}
    }