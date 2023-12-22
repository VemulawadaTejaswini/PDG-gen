import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		
		String s [] = new String [A];
		for (int i=0; i<A; i++){
			s[i]=sc.next();
		}
		
		boolean ans = true;
		for (int i=0; i<A-1; i++){
			String S = s[i];
			String N = s[i+1];
			int length = S.length();
			//System.out.println(S);
			
			if (S.charAt((length-1))!=N.charAt(0)){
				ans=false;
				break;
			}
		}
		Arrays.sort(s);
		for (int i=0; i<A-1; i++){
			if (s[i].equals(s[i+1])){
				ans=false;
				break;
			}
		}
		
		
		if (ans==false)
			System.out.println("No");
		else
			System.out.println("Yes");
		sc.close();
		
	}

}