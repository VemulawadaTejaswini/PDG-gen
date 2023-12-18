import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			String[] num = sc.readLine().split(" ");
			int a = Integer.parseInt(num[0]);
			int b = Integer.parseInt(num[2]);
			
			if(num[1].equals("+")) 
				System.out.println(a+b);
			else if(num[1].equals("-"))
				System.out.println(a-b);
			else if(num[1].equals("*")) 
				System.out.println(a*b);
			else if(num[1].equals("/")) 
				System.out.println(a/b);
			else 
				break;
			
		}
	}
}