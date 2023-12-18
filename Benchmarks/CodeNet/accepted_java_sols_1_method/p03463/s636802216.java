import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] tmpArray = br.readLine().split(" ");

		int n = Integer.parseInt(tmpArray[0]);
		int a = Integer.parseInt(tmpArray[1]);
		int b = Integer.parseInt(tmpArray[2]);

		if(Math.abs(a - b) % 2 != 0){
			System.out.println("Borys");
		}
		else {
//			System.out.println(Math.abs((a-b)%2));
			System.out.println("Alice");
		}


	}

}
