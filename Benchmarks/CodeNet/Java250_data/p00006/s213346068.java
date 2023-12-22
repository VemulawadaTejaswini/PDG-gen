import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		StringBuffer s = new StringBuffer(str);
		System.out.println(s.reverse());
	}
	
}

