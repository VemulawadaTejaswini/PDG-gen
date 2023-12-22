import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		String s[] = sc.next().split("");
		String s1 = "";
		String s2 = "";
		
		
		for (int i = 0 ; i < n ; i++ ) {
			if(i < n/2) {
				s1 += s[i];
			}else {
				s2 += s[i];
			}
			
		}
		
		String ans = "No";
		
		if(s1.equals(s2)) {
			ans = "Yes";
		}
		
		System.out.println(ans);

	}

}