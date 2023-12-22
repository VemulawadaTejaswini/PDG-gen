
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String result = "Good";
		for(int i = 0; i < s.length() - 1; i++) {
			if(s.substring(i, i + 1).equals(s.substring(i + 1, i + 2))) result = "Bad";
		}
      System.out.println(result);
	}

}
