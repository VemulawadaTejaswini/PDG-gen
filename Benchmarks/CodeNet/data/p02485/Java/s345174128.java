import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String x = scn.next();
		while(!x.equals("0")){
			int result = 0;
			while(!x.equals("")){
				result += Integer.parseInt("" + x.charAt(0));
				x = x.substring(1);
			}
			System.out.println(result);
			x = scn.next();
		}
	}
}