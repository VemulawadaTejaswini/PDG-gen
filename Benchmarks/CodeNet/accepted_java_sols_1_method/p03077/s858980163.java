import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		//コマンドライン引数取得部分
		Scanner scanner = new Scanner(System.in);
		//グループ人数
		Long people = scanner.nextLong();
		//乗客数
		//ArrayList<Long> passengerNumList = new ArrayList<>();
		//for (int i = 0; i < 5; i++) {
		//	passengerNumList.add(scanner.nextLong());
		//}

		//賢いやり方
		long A = scanner.nextLong();
		long B = scanner.nextLong();
		long C = scanner.nextLong();
		long D = scanner.nextLong();
		long E = scanner.nextLong();
		scanner.close();

		//JDK1.8で導入されたStreamを使用する。
		long min = Arrays.asList(A, B, C, D, E).stream().min(Comparator.naturalOrder()).get();
		System.out.println(4L + (long)Math.ceil((double) people/min));

		//Long ZERO = new Long(0);

		//最小移動時間
		//int time = 0;

		//各都市に残っている人数
		//Long[] cityNumList = { people, ZERO, ZERO, ZERO, ZERO, ZERO };

		//while (cityNumList[5].compareTo(people) != 0) {
			//for (int i = 4; 0 <= i; i--) {
				//if (cityNumList[i] > 0) {
					//if (cityNumList[i] > passengerNumList.get(i)) {
						//cityNumList[i + 1] += passengerNumList.get(i);
						//cityNumList[i] -= passengerNumList.get(i);
					//} else {
						//cityNumList[i + 1] += (cityNumList[i]);
						//cityNumList[i] = ZERO;
					//}
				//}
			//}
			//time++;
			//System.out.println(cityNumList[5]);
		//}
		//System.out.println(time);
	}

}
