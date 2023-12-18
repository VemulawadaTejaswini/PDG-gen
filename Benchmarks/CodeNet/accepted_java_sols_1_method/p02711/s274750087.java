import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String a = String.valueOf(n);
		
		char[] s = a.toCharArray();
		
		if(s[0] == '7'||s[1] == '7'||s[2] == '7') {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
		
		}	
 	}

