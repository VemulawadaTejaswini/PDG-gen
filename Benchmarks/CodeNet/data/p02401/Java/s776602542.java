import java.io.*;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br =
			new BufferedReader(new InputStreamReader(System.in));

		while(true) {
			String[] input = br.readLine().split(" ");
			int a = Integer.parseInt(input[0]);
			int b = Integer.parseInt(input[2]);
			char op = input[1].charAt(0);

			if(op == '?')
				break;
			if(op == '+') {
				System.out.println(a + b);
			}
			if(op == '-') {
				System.out.println(a - b);
			}
			if(op == '*') {
				System.out.println(a * b);
			}
			if(op == '/') {
				System.out.println(a / b);
			}
		}
	}
}