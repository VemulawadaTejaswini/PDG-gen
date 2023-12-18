import java.io.*;

public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true){
			String input = br.readLine();
			String[] param = input.split(" ");
			Integer a = Integer.parseInt(param[0]);
			Integer b = Integer.parseInt(param[2]);
			if(a == 0 && b == 0){
				break;
			}
			String op = param[1];
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
			}
		}
	}
}