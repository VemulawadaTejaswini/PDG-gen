import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
	    // 引数で標準入力System.inを指定する
	    Scanner scanner = new Scanner(System.in);
		try {

		    // 1行目を取得(a)
			String[] line1Array = scanner.nextLine().split(" ");
			int num = Integer.parseInt(line1Array[0]);

			for (int i = 1; i < num + 1; i++) {
				int answer = searcher(i);
				System.out.printf("%d", answer);
				System.out.println("");
			}

		} finally {
		    // Scannerクラスのインスタンスをクローズ
		    scanner.close();
		}
		long end = System.currentTimeMillis();
		System.out.println((end - start) );
	}

	public static int searcher (int target) {
		int answer = 0;

		boolean isNotOveredX =true;
		int x = 0;

		boolean isNotOveredY =true;
		int y = 0;

		boolean isNotOveredZ =true;
		int z = 0;

		while (isNotOveredX) {
			x++;
			y=0;
			z=0;

			// 打ち切る
			if (x >= target) { break; }

			long sum = (x * x);

			if ( sum >= target) {break;}

			while (isNotOveredY) {
				y++;
				z=0;

				// 打ち切る
				if (y >= target) { break; }

				//sum = (x * x) + (y * y) + (x * y) ;
				sum = (x * x) + y * (y + x);

				// 打ち切る
				if ( sum >= target) { break;}

				while (isNotOveredZ) {

					z++;
					//long sum =  (x * x) + (y * y) + (z * z) + (x * y) + (y * z)  + (z * x) ;

					// 打ち切る
					if (z >= target) { break; }

					long beforeSum = sum;
					// sum = sum + (z * z)  + (y * z)  + (z * x) ;
					sum = sum + (z * z)  + z * (y +x) ;
					//sum =  (x * x) + (y * y) + (z * z) + (x * y) + (y * z)  + (z * x) ;

					if (sum > target)  { break; }

					if (sum == target) {
						answer++;
					}
					sum = beforeSum;
				}
			}
		}
		return answer;
	}

}
