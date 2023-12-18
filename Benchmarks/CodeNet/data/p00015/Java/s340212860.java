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

		while (length1 > 0 || length2 > 0) {
			int num1, num2;
			StringBuilder ans = new StringBuilder();

			if (length1 >= 8) {
				num1 = Integer.parseInt(input1.substring(length1 - 8, length1));
			} else if (length1 > 0) {
				num1 = Integer.parseInt(input1.substring(0,length1));
			} else {
				num1 = 0;
			}

			if (length2 >= 8) {
				num2 = Integer.parseInt(input2.substring(length2 - 8, length2));
			} else if (length2 > 0){
				num2 = Integer.parseInt(input2.substring(0,length2));
			} else {
				num2 = 0;
			}

			ans.append(String.valueOf((num1 + num2 + over) % 100000000));
			over = (num1 + num2 + over) / 100000000;

			while (over != 0 && ans.length() < 8) {
				ans.insert(0,"0");
			}

			answer.insert(0,ans);

			length1 -= 8;
			length2 -= 8;
		}

		if (over != 0) {
			answer.insert(0,String.valueOf(over));
		}

		System.out.println(answer);

		count--;
	}
    }
}