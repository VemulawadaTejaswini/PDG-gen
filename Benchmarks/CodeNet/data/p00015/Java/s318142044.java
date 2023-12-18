import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

class Main{
    public static void main(String[] a) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	int count = Integer.parseInt(br.readLine());

	while (count > 0) {
		int length1, length2, over = 0;
	        String input1 = br.readLine();
	        String input2 = br.readLine();
		StringBuilder answer = new StringBuilder();

		length1 = input1.length();
		length2 = input2.length();

		if (length1 > 80 || length2 > 80) {
			System.out.println("overflow");
			continue;
		}

		while (length1 > 0 || length2 > 0) {
			int num1, num2;
			StringBuilder ans = new StringBuilder();

			if (length1 >= 8) {
				// 残り桁数が8桁以上の時、8桁で処理
				num1 = Integer.parseInt(input1.substring(length1 - 8, length1));
			} else if (length1 > 0) {
				// 残り桁数が8桁未満の時、残り桁数を処理
				num1 = Integer.parseInt(input1.substring(0,length1));
			} else {
				// 残り桁数がなくなった時、加算値を「0」に
				num1 = 0;
			}

			if (length2 >= 8) {
				// 残り桁数が8桁以上の時、8桁で処理
				num2 = Integer.parseInt(input2.substring(length2 - 8, length2));
			} else if (length2 > 0){
				// 残り桁数が8桁未満の時、残り桁数を処理
				num2 = Integer.parseInt(input2.substring(0,length2));
			} else {
				// 残り桁数がなくなった時、加算値を0に
				num2 = 0;
			}

			length1 -= 8;
			length2 -= 8;

			ans.append(String.valueOf((num1 + num2 + over) % 100000000));
			over = (num1 + num2 + over) / 100000000;

			while (ans.length() < 8 && (length1 > 0 || length2 > 0)) {
				// 残っている桁があり、100000000で割った余りが8桁に満たない場合に
				// 「0」を付加
				ans.insert(0,"0");
			}

			answer.insert(0,ans);


		}

		if (over != 0) {
			answer.insert(0,String.valueOf(over));
		}

		if (answer.length() < 80) {
			System.out.println(answer);
		} else {
			System.out.println("overflow");
		}

		count--;
	}
    }
}