import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();

		String s1 = s.replaceAll(s.substring(0,1), "");
		String s2;
		if(s1.length() != 0) {
			s2 = s1.replaceAll(s1.substring(0, 1), "");
		}else {
			s2 = "AAAAA";
		}
		
		if(s1.length() == 2 && s2.length() ==0) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
				
		sc.close();	
	}
}