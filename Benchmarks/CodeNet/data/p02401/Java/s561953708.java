import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp[], op;
		long a, b;
		while (true) {
			tmp = br.readLine().split(" ");
			a = Long.parseLong(tmp[0]);
			b = Long.parseLong(tmp[2]);
			op = tmp[1];
			tmp = null;
			
			if(op.equals("?"))break;
			switch(op){
			case "+":
				System.out.println(a + b);
				break;
			case "-":
				System.out.println(a - b);
				break;
			case "*":
				System.out.println(a * b);
				break;
			case "/":
				System.out.println(a / b);
				break;
			default:
			}
		}
	}

}