import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
	    // 引数で標準入力System.inを指定する
	    Scanner scanner = new Scanner(System.in);
		try {

		    // 1行目を取得(a)
			int n  = scanner.nextInt();
			scanner.nextLine();
			String x  = scanner.next();
			scanner.nextLine();

			int count = 0;
			long baseValPlus = 0;
			long baseValMinus = 0;

			// デフォルト値を計算する
			int  baseDiv = countLetter (x, '1');
			if (baseDiv == 0) {
				// 0なので何もしないbase=0でいいはず
			} else {
				// 桁単位でmodして余りを足していく
				for (int j = 0; j < x.length(); j++) {
					if (x.charAt(j) == '0') {
						continue;
					}
					long pow = (long)Math.pow(2, x.length() - (j + 1));
					long modPlus =  pow % (baseDiv + 1);
					long modMinus = pow % (baseDiv - 1);
					baseValPlus = baseValPlus + modPlus;
					baseValMinus = baseValMinus + modMinus;
				}

				// すべての和を足し合わせておく
				baseValPlus = baseValPlus % (baseDiv + 1);
				baseValMinus = baseValMinus % (baseDiv - 1);
			}

			for (int i = 0; i < n; i++) {

				count = 0;
				int div = baseDiv;
				long val = 0;

				// 初回処理
				count++;
				if( x.charAt(i) == '0') {
					div++;
					val = baseValPlus + ((1 <<  n - (i + 1)) % (div));
				} else {
					div--;
					val = Math.abs(baseValMinus - ((1 <<  n - (i + 1)) % (div)));
				}
				val = val % div;
				// 値が更新されたのでリフレッシュ
				div = Long.bitCount(val);
				if (div == 0) {
					System.out.println(count);
					continue;
				}
				while (true) {
					count++;
					if( x.charAt(i) == '0') {
						val = popcount(val, div);
					} else {
						val = popcount(val, div);
					}
					if(val == 0) {
						break;
					}
					// 値が更新されたのでリフレッシュ
					div = Long.bitCount(val);
				}
				System.out.println(count);

			}

		} finally {
		    // Scannerクラスのインスタンスをクローズ
		    scanner.close();
		}
		long end = System.currentTimeMillis();
		// System.out.println((end - start) );
	}

	private static String createValBy(String x, int keta) {

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < x.length(); i++) {
			if (i == keta) {
				if (x.charAt(i) == '0') {
					sb.append('1');
					continue;
				}
				sb.append('0');
				continue;
			}
			sb.append(x.charAt(i));
		}

		return sb.toString();
	}

	private static long createVal(String x, int keta) {

		return Long.parseLong(createValBy(x, keta));
	}


	private static int countLetter(String value,  char target) {

		int count = 0;

		for (int i = 0; i < value.length(); i++) {
			if (value.charAt(i) == target) {
				count++;
			}
		}
		return count;
	}


	private static long popcount(long val, long div) {
		return val % div;
	}

	// ************************************
	// Common
	// ************************************

	private static final int[] changeArrayStringToInt(String[] strArray) {

		int[] intArray = new int[strArray.length];

		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = Integer.parseInt(strArray[i]);
		}
		return intArray;
	}

}