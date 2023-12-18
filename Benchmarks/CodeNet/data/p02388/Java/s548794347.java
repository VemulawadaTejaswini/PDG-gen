import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String num = br.readLine();
		int num1 = Integer.parseInt(num);

		num1 = num1*num1*num1;

		System.out.println(num1);







	}

}