import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = null;
		try {
			input = br.readLine();

		} catch (IOException e) {
		}
		int n = Integer.parseInt(input);
		try {
			input = br.readLine();
		} catch (IOException e) {
		}
		String[] inputs = input.split(" ");
		/*
		 int min = Integer.parseInt(inputs[0]);
		 int max = Integer.parseInt(inputs[1]);
		 int sum = Integer.parseInt(inputs[2]);
		
		 上のinput.split(" ");で（）内を並べるというのは
		
		
		 最後の答えとして並べるという意味ではなく、
		
		
		 計算のために３．５．７…みたいに並べてるだけであって、
		 答えを空白で区切って答えろという問題の答えは、
		
		
		 System.out.println(なんとか  +  " " + なんちゃら)
		
		
		 ということを忘れてはいけない！
		*/
		long sum = 0;
		int max = -1000000;
		int min = 1000000;
		for (int i = 0; i < n; i++) {
			sum = sum + Integer.parseInt(inputs[i]);
			int num = Integer.parseInt(inputs[i]);
			if (max < num) {
				max = num;
			}

			if (min > num) {
				min = num;
			}
		}
		System.out.println(min + " " + max + " " + sum);
	}
}
