import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		String s = sc.next();
		StringBuilder newS = new StringBuilder();
		newS.append(s.substring(0, k-1));
		newS.append(s.substring(k - 1, k).toLowerCase());
		newS.append(s.substring(k));
		
		System.out.println(newS);
	}	
}