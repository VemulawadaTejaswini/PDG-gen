import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		while(true){
			String line = input.readLine();
			String[] str = line.split(" ");
			int a = Integer.parseInt(str[0]);
			int b = Integer.parseInt(str[2]);
			String ob = str[1];
			if(ob.equals("+")) sb.append(a+b + "\n");
			else if(ob.equals("-")) sb.append(a-b + "\n");
			else if(ob.equals("*")) sb.append(a*b + "\n");
			else if(ob.equals("/")) sb.append(a/b + "\n");
			else break;
		}
		
		System.out.print(sb);
		
	}

}