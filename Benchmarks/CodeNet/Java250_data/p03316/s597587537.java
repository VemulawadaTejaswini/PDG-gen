import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		
		int n1 = Integer.parseInt(s);
		int n2 = 0;
		for(int i=0; i<s.length(); ++i) {
			n2 += Integer.parseInt(s.charAt(i) + "");
		}
		
		if(n1%n2 == 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		
	}

}