
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		List list = new ArrayList();
		while(br.readLine() != null){
			String str = br.readLine();
			list.add(str);
		}
		int n = Integer.parseInt((list.get(0)).toString());
		String str2 = (list.get(1)).toString();

		String[] ai = str2.split(" ", 0);

		// ????°?????????????
		int sVal = 0; // ???????°??????????
		int min = Integer.parseInt(ai[0]); // ????°????
		for (int i = 0; i < n; i++) {
			int num1 = Integer.parseInt(ai[i]);
			int num2 = Integer.parseInt(ai[i + 1]);
			// ??§?°???????
			if (num1 <= num2) {
				sVal = num1;
			} else {
				sVal = num2;
			}
			// ????°??????????
			if (sVal <= min) {
				min = sVal;
			}
		}

		// ?????§????????????
		int bVal = 0; // ????????§?????????
		int max = Integer.parseInt(ai[0]); // ?????§???
		for (int i = 0; i < n; i++) {
			int num1 = Integer.parseInt(ai[i]);
			int num2 = Integer.parseInt(ai[i + 1]);
			// ??§?°???????
			if (num1 <= num2) {
				bVal = num2;
			} else {
				bVal = num1;
			}
			// ?????§?????????
			if (max <= bVal) {
				max = bVal;
			}
		}

		// ????¨?
		int sum = Integer.parseInt(ai[0]);
		for (int i = 1; i < n; i++) {
			int num = Integer.parseInt(ai[i]);
			sum = +num;
		}

		System.out.println(min + " " + max + " " + sum);

	}
}