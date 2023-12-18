import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


		int n = Integer.parseInt(br.readLine());

		int[] input = new int[n];


		for(int i = 0; i < n; i++){
			input[i] = Integer.parseInt(br.readLine());
		}


		//先頭が0以外は論外
		if(input[0] != 0){
			System.out.println(-1);
			return;
		}
		//まずは可能かどうかの判定
		//長さが1ならA1も0でなければならない
		if(n == 1){
			if(input[0] == 0){
				System.out.println(0);
				return;
			}
			else {
				System.out.println(-1);
				return;
			}
		}

		//先頭が0で次が2以上は論外
		if(input[0] == 0 && input[1] >= 2){
			System.out.println(-1);
			return;
		}

		for(int i = 0; i < n - 1; i++){
			if(input[i] + 1 < input[i + 1]){
				System.out.println(-1);
				return;
			}
		}

		long sum = input[n - 1];
		long minus = 0;
		long result = 0;

		for(int i = n - 1; i > 0; i--){

//			if(input[i] >= 1){
//				result += input[i];
//				input[i - 1] -= input[i] - 1;
//			}

			sum += input[i - 1];
			if(input[i - 1] + 1 == input[i]){
				minus += input[i - 1];
			}
//			System.out.println("i = "+ i + " input[i] = "+input[i]);
		}
		result = sum - minus;

		System.out.println(result);
	}
}
