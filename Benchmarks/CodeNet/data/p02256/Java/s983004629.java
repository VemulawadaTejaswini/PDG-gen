import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] number = br.readLine().split(" ");

		int x = Integer.parseInt(number[0]);
		int y = Integer.parseInt(number[1]);

		if(x < y){
			int tmp = x;
			x = y;
			y = tmp;
		}

		while(y != 0) {
			int calResult = x % y;

			if(calResult == 0){
				break;
			}

			x = y;
			y = calResult;
		}
		System.out.println(y);
	}
}