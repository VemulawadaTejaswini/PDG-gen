import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args)throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		while(true){
			double ans = 0;
			String line = br.readLine();
			String[] str = line.split(" ");
			int a = Integer.parseInt(str[0]);
			int b = Integer.parseInt(str[2]);
			
			switch(str[1]){
				case "+":
					ans = a + b;
					break;
				case "-":
					ans = a - b;
					break;
				case "*":
					ans = a * b;
					break;
				case "/":
					ans = a / b;
					break;
				default:
					break;
			}
			if(str[1].equals("?")){
				break;
			}
			sb.append(ans).append("\n");
			System.out.print(sb);
		}
	}
}