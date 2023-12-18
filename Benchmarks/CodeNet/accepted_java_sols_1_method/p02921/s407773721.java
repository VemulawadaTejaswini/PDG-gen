import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		char[] s = in.next().toCharArray();
		char[] t = in.next().toCharArray();
		int cnt = 0;
		for(int i = 0; i<3; i++) {
			
			if(s[i] == t[i]) {
				cnt++;
			}
		}

		System.out.println(cnt);
		in.close();


	}

}