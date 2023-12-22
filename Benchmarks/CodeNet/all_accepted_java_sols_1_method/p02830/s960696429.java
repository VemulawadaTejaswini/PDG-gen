import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		String ans = "";
		String s1 = scan.next();
		String s2 = scan.next();
		char new_string[] = new char[2*n];
		for(int i=0;i<n;i++) {
			new_string[2*i] = s1.charAt(i);
			new_string[2*i+1] = s2.charAt(i);
		}
		for(int i=0;i<2*n;i++) {
			ans += String.valueOf(new_string[i]);
		}
		System.out.println(ans);
	}

}


