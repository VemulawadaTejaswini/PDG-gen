import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while(true){
			// 入力処理ここから
			String input = null;
			try {
				input = br.readLine();
			} catch (IOException e) {
			}
			String[] inputs = input.split(" ");
			int a = Integer.parseInt(inputs[0]);
			String op = inputs[1];
			int b = Integer.parseInt(inputs[2]);
			// 入力処理ここまで

			// op分岐ここから
			int result = 0;
			boolean isLoop = true;
			switch(op){
				case "+":
					result = a + b;
					break;
				case "-":
					result = a - b;
					break;
				case "*":
					result = a * b;
					break;
				case "/":
					result = a / b;
					break;
				case "?":
					isLoop = false;
					break;
				default:
					break;
			}
			// op分岐ここまで

			// op結果ここから
			if(!isLoop){
				break;
			}
			System.out.println(result);
			// op結果ここまで
		}
	}
}

