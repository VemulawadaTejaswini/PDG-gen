import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s;
		
		s = sc.next();
		
		sc.close();
		int count[], n = s.length();
		count = new int[27];
		boolean d = true;
		
		for(int i = 0; i < n; ++i) {
			int tmp = s.charAt(i) - 'a';
			count[tmp]++;
		}		
		for(int i = 0; i < 26; ++i) {
			if(count[i] > 1) {
				d = false; 
				break;
			}
		}
		
		if(d)System.out.println("yes");
		else System.out.println("no");
	}

}
