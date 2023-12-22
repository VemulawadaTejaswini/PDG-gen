import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		String s=String.valueOf(scanner.nextInt());
		
		String ans="";
		for(int i=0;i<3;i++) {
			char c=s.charAt(i);
			if(c=='1')ans+="9";
			else ans+="1";
		}
		
		System.out.println(Integer.parseInt(ans));
	}
}