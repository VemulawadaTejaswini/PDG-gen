import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		String[] strs;
		int a;
		String op;
		int b;
		int ans = 0;//解答
		while(true){
			str = br.readLine();
			strs = str.split(" ");
			a = Integer.parseInt(strs[0]);
			op = strs[1];
			b = Integer.parseInt(strs[2]);
			if(op.equals("?")){
				break;
			}else if(op.equals("+")){
				ans = a + b;
			}else if(op.equals("-")){
				ans = a - b;
			}else if(op.equals("*")){
				ans = a * b;
			}else if(op.equals("/")){
				ans = a / b;
			}//if
			System.out.println(ans);
		}//while
	}
}