import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		
		String ans = "";
		if("Sunny".equals(S)) {
			ans = "Cloudy";
		}else if("Cloudy".equals(S)) {
			ans = "Rainy";
		}else {
			ans = "Sunny";
		}
		System.out.println(ans);
		
	}

}
