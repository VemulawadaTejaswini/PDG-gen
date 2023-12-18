import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Integer[] flag = new Integer[64];
		for (int i = 0; i<64; i++) flag[i] = 0;  //初期化
		try (Scanner sc = new Scanner(System.in)){
			int times = sc.nextInt();
			ArrayList<ArrayList<Integer>> array = new ArrayList<ArrayList<Integer>>();
			for (int i=0; i<times; i++) {
				ArrayList<Integer> a = new ArrayList<Integer>();
				int obj = sc.nextInt();
				for (int j=0; j<obj; j++) a.add(sc.nextInt());
				array.add(a);
			}
			times = sc.nextInt();

			boolean b;
			for (int i=0; i<times; i++) {
				int query = sc.nextInt();
				int no = sc.nextInt();
				switch (query) {
				//test(i)
				case 0:
					System.out.println(flag[no]);
					break;

				//set(i)  ONにする
				case 1:
					for (int j=0; j<array.get(no).size(); j++) flag[array.get(no).get(j)]=1;
					break;

				//clear(i)  OFFにする
				case 2:
					for (int j=0; j<array.get(no).size(); j++) flag[array.get(no).get(j)]=0;
					break;

				//flip(i)  反転する
				case 3:
					for (int j=0; j<array.get(no).size(); j++) {
						if (flag[array.get(no).get(j)]==0) {
							flag[array.get(no).get(j)]= 1;
						} else flag[array.get(no).get(j)]= 0;
					}
					break;

				//all  全てのフラグがON？
				case 4:
					b = true;
					for (int j=0; j<array.get(no).size(); j++) {
						if (flag[array.get(no).get(j)]!=1) {
							b = false;
							break;
						}
					}
					System.out.println(b ? "1":"0");
					break;

				//any
				case 5:
					b = false;
					for (int j=0; j<array.get(no).size(); j++) {
						if (flag[array.get(no).get(j)]==1) {
							b = true;
							break;
						}
					}
					System.out.println(b ? "1":"0");
					break;

				//none  全てのフラグがOFF？
				case 6:
					b = true;
					for (int j=0; j<array.get(no).size(); j++) {
						if (flag[array.get(no).get(j)]!=0){
							b = false;
							break;
						}
					}
					System.out.println(b ? "1":"0");
					break;

				//count
				case 7:
					int count = 0;
					for (int j=0; j<array.get(no).size(); j++) {
						count += flag[array.get(no).get(j)];
					}
					System.out.println(count);
					break;

				//val  状態の整数値を出力する  最大：18446744073709551615
				case 8:
					BigDecimal total = new BigDecimal("0");
					for (int j =0; j<array.get(no).size(); j++) {
						if ( array.get(no).get(j) != 63) {
							String s = Long.toString((long)(flag[array.get(no).get(j)] * Math.pow(2, array.get(no).get(j))));
							BigDecimal bi = new BigDecimal(s);
							total = total.add(bi);   //二進数を10進数に変換
						} else {
							if (flag[63] == 1) {
								BigDecimal pow63 = new BigDecimal("9223372036854775808");  //2の63乗
								total = total.add(pow63);
								break;
							}
						}
					}
					System.out.println(total);
					break;
				}
			}
		}
	}
}

