import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		
		if(s.charAt(0)!='A') {
			System.out.println("WA");
			return;
		}
		
		int cnt=0;
		for(int i=2;i<=s.length()-2;i++) {
			if(s.charAt(i)=='C')cnt++;
		}
		if(cnt!=1) {
			System.out.println("WA");
			return;
		}
		
		cnt=0;
		for(int i=0;i<s.length();i++) {
			if(Character.isUpperCase(s.charAt(i)))cnt++;
		}
		if(cnt!=2) {
			System.out.println("WA");
			return;
		}
		
		System.out.println("AC");
	}
}