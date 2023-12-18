import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char a = sc.next().toCharArray()[0];
		System.out.println('a'<=a && a<='z' ? "a" : "A");
		
		sc.close();
	}
}
