import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		int lose = 0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='o') {
				
			}else {
				lose++;
			}
		}
		if(lose>=8) System.out.println("NO");
		else System.out.println("YES");
		
		
		in.close();

	}

}
