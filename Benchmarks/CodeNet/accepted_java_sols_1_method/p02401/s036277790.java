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
			String op = param[1];
			Integer a = Integer.parseInt(param[0]);
			Integer b = Integer.parseInt(param[2]);
			if(op.equals("+")){
				System.out.println(a + b);
			}
			else if(op.equals("-")){
				System.out.println(a - b);
			}
			else if(op.equals("*")){
				System.out.println(a * b);
			}
			else if(op.equals("/")){
				System.out.println(a / b);
			}
			else{
				break;
			}
		}
	}
}