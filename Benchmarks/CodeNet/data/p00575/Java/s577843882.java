import java.io.BufferedReader;
import java.io.InputStreamReader;


class Main {

	public static void main(String[] args) throws Exception {
		Integer numWeekday = 0;	//曜日の番号(0:日、1：月、....6:土)
		Integer result = 0;	// ログイン回数
		Integer total = 0;	// 総ポイント数


		try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
			String[] data = reader.readLine().split(" ");
			Integer a = Integer.parseInt(data[0]);
			Integer b = Integer.parseInt(data[1]);
			Integer c = Integer.parseInt(data[2]);

			while (total < c) {
				// ログイン回数+1,曜日+1,総ポイント+a
				result += 1;
				numWeekday = (numWeekday + 1) % 7;
				total += a;

				if(numWeekday == 0){
					total += b;
				}

			}

			System.out.println(result);

		}
	}

}
