import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			String s = sc.next();
			int n = s.length();
			String new_str1 = s.substring(n-1, n);
			if(new_str1.equals("s")) {
				System.out.println(s + "es");
			}
			else {
				System.out.println(s + "s");
			}
		}
	}

}