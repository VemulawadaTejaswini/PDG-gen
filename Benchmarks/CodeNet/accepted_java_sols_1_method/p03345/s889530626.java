import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] tmpArray = br.readLine().split(" ");

		long a = Long.parseLong(tmpArray[0]);
		long b = Long.parseLong(tmpArray[1]);
		long c= Long.parseLong(tmpArray[2]);
		long k = Long.parseLong(tmpArray[3]);

		long result = 0;
		if(k % 2 == 1){
			result = b - a;
		}
		else {
			result = a - b;
		}

		System.out.println(result);
	}

}
