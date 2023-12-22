import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		String[] tmpArray = br.readLine().split(" ");

		int array[] = new int[n];

		for(int i = 0; i < n ; i++){
			array[i] = Integer.parseInt(tmpArray[i]);
		}

		long two = 0;

		for(int i = 0; i < n; i++){
			two += numOfTwo(array[i]);
		}

		System.out.println(two);
	}

	static int numOfTwo(int n){
		int result = 0;

		while(n % 2 == 0){
			n /= 2;
			result++;
		}

//		System.out.println(result);
		return result;
	}

}
