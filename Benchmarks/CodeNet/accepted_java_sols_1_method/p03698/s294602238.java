import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String ans = "yes";
		for(int i = 0; i < s.length()-1; i++) {
			for(int j = i+1; j < s.length(); j++) {
				if(s.charAt(i)==s.charAt(j)) {
					ans = "no";
				}
			}
		}
		System.out.println(ans);
	}
}