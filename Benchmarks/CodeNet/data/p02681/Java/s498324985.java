import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();
		if(t.contains(s) && t.length()-s.length()==1) {
			
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
	}
}