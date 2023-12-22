import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		in.close();
		
		String ans = str.charAt(5) == '1' ? "TBD"
				: str.charAt(6) > '4' ? "TBD" : "Heisei";
		System.out.println(ans);
	}
}