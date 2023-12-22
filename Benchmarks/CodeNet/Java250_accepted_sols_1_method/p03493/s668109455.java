import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		Integer oneCount = 0;
		if(s.charAt(0) == '1') {
			oneCount ++;
		}
		if(s.charAt(1) == '1') {
			oneCount ++;
		}
		if(s.charAt(2) == '1') {
			oneCount ++;
		}
		System.out.println(oneCount);
	}
}