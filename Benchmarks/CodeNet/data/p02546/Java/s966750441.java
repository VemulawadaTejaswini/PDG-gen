import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		s += s.charAt(s.length() - 1) == 's' ? "es" : "s";
		System.out.println(s);
		
		sc.close();
	}
}

