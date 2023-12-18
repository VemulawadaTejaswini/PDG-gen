import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String S = sc.next();
		String T = sc.next();
		
		char[] SC = S.toCharArray();
		char[] TC = T.toCharArray();
		
		int count = 0;
		for(int i=0;i<3;i++) {
			if(SC[i] == TC[i]) {
				count++;
			}
		}
		
		System.out.println(count);
		
		sc.close();	
	}
}