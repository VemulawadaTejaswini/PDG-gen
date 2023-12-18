import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Squared {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("値を入力してください(このプログラムは値を3乗するものです)。");
		int x = Integer.parseInt(br.readLine());
		System.out.println(x*x*x);
	}

}

