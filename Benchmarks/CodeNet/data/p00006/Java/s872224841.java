import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str;
		
		str = sc.next();
		StringBuffer sb = new StringBuffer(str);
		System.out.print(sb.reverse());
		
	}
}