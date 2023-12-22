import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		boolean ans = true;
		for(int i=0;i<s.length();i++) {
			if(i%2==0 && s.charAt(i)=='L') {
				ans = false;
				break;
			}else if(i%2==1 && s.charAt(i)=='R') {
				ans = false;
				break;
			}
		}
		System.out.println(ans?"Yes":"No");
		in.close();

	}

}
