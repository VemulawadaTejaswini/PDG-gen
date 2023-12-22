import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static final int BIG_NUM  = 2000000000;
	public static final int MOD  = 1000000007;

	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Integer> S = new Stack<Integer>();
		int A,B;

		try {

			String input[] = br.readLine().split("\\s+");

			for(int i = 0; i < input.length; i++){
				if(checkInt(input[i])){
					S.push(Integer.parseInt(input[i]));
					continue;
				}

				B = S.peek();
				S.pop();
				A = S.peek();
				S.pop();

				if(input[i].equals("+")){
					S.push(A+B);
				}else if(input[i].equals("*")){
					S.push(A*B);
				}else if(input[i].equals("-")){
					S.push(A-B);
				}
			}
			System.out.println(S.peek());

		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static boolean checkInt(String number){
		Pattern p = Pattern.compile("^[0-9]+$");
		Matcher m = p.matcher(number);
		return m.matches();
	}

}

