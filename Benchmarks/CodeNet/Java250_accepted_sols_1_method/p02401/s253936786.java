import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		loop: for(;;) {
		String num = br.readLine();
		String[] set = num.split(" ");

		int a = Integer.parseInt(set[0]);
		int b = Integer.parseInt(set[2]);

		switch(set[1]){
		case "+":
			sb.append(a + b).append("\n");
			break;
		case "-":
			sb.append(a - b).append("\n");
			break;
		case "*":
			sb.append(a * b).append("\n");
			break;
		case "/":
			sb.append(a / b).append("\n");
			break;
		case "?":
			break loop;
       }
	}

		System.out.print(sb);

	}

}