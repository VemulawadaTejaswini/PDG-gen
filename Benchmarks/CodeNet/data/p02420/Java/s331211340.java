import java.util.*;

public class Main{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		for(;;){
			String input = scan.next();
			if(input.equals("-")){
				break;
			}
			int m = scan.nextInt();
			int len = input.length();
			StringBuilder sb = new StringBuilder();
			String output = input;
			for(int i = 0; i < m; i++){
				int h = scan.nextInt();
				String s1 = output.substring(0, h);
				String s2 = output.substring(h, len);
				sb.append(s2).append(s1);
				output = sb.toString();
			}
			System.out.println(output);
		}
	}
}