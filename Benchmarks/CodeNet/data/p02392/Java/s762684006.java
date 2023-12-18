import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);

		String str = br.readLine();

		calc(str);
	}

	public static void calc(String str) {
		String[] result = str.split(" ");

		int num1 = Integer.parseInt(result[0]);
		int num2 = Integer.parseInt(result[1]);
		int num3 = Integer.parseInt(result[2]);

		if (num1 < num2) {
			if(num2 < num3){
				System.out.println("Yes");
			}else{
				System.out.println("No");
			}
		}else{
			System.out.println("No");
		}
	}
}