import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int c = s.indexOf("C");
		int f = s.substring(c+1).indexOf("F");
		
		System.out.println(c>=0 && f>=0 ? "Yes" : "No");
		
		sc.close();
	}
}
