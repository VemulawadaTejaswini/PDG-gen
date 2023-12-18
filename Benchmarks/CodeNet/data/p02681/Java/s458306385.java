import java.util.Scanner;
public class Codechef{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();
		s = s.toLowerCase();
		t=t.toLowerCase();
		t=t.replace(s,"");
		t=t.trim();
		if(t.length()==1) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}
}
}