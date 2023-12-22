import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		
		int ans = 0;
		for(int i=0; i<4; i++) {
			if(S.charAt(i) == '+') {
				++ans;
			} else {
				--ans;
			}
		}
		
		System.out.println(ans);

	}

}
