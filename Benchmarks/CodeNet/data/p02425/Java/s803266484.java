import java.math.BigDecimal;
import java.util.Scanner;
import java.util.stream.IntStream;

class Main {
	public static void main(String[] args) {
		int[] flag = new int[64];
		for (int i = 0; i<64; i++) flag[i] = 0;  //初期化
		IntStream flags = IntStream.of(flag);
		try (Scanner sc = new Scanner(System.in)){
			int times = sc.nextInt();
			int no = 0;
			boolean b;
			for (int i=0; i<times; i++) {
				int query = sc.nextInt();
				switch (query) {
				//test(i)
				case 0:
					no = sc.nextInt();
					System.out.println(flag[no]);
					break;

				//set(i)  ONにする
				case 1:
					no = sc.nextInt();
					flag[no]=1;
					break;

				//clear(i)  OFFにする
				case 2:
					no = sc.nextInt();
					flag[no]=0;
					break;

				//flip(i)  反転する
				case 3:
					no = sc.nextInt();
					flag[no] = flag[no]==0 ? 1:0;
					break;

				//all  全てのフラグがON？
				case 4:
					flags = IntStream.of(flag);
					b = flags.allMatch(f -> f == 1);
					System.out.println(b ? "1":"0");
					break;

				//any
				case 5:
					flags = IntStream.of(flag);
					b = flags.anyMatch(f -> f == 1);
					System.out.println(b ? "1":"0");
					break;

				//none  全てのフラグがOFF？
				case 6:
					flags = IntStream.of(flag);
					b = flags.allMatch(f -> f == 0);
					System.out.println(b ? "1":"0");
					break;

				//count
				case 7:
					flags = IntStream.of(flag);
					System.out.println(flags.sum());
					break;

				//val  状態の整数値を出力する  最大：18446744073709551615
				case 8:
					BigDecimal total = new BigDecimal("0");
					for (int j =0; j<64; j++) {
						String s = Long.toString((long)(flag[j] * Math.pow(2, j)));
						BigDecimal bi = new BigDecimal(s);
						total = total.add(bi);  //二進数を10進数に変換
					}
					if (flag[63] == 1) total = total.add(new BigDecimal("1"));  //2の63乗：9223372036854775808
					System.out.println(total);
					break;
				}
			}
		}
	}
}
