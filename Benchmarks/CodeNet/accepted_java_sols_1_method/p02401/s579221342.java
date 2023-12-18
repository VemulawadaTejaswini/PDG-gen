import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args)throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true){
			String line = br.readLine();
			String[] str = line.split(" ");
			int a = Integer.parseInt(str[0]);
			int b = Integer.parseInt(str[2]);
			if(str[1].equals("?")){
		 		break;
			}
			
			if(str[1].equals("+")){
				System.out.println(a + b);
			} else if(str[1].equals("-")){
				System.out.println(a - b);
			} else if(str[1].equals("*")){
				System.out.println(a * b);
			} else if(str[1].equals("/")){
				System.out.println(a / b);
			}
		}
	}
}