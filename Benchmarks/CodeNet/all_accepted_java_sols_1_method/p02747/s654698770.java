import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

	Scanner sca = new Scanner(System.in);
	String str = sca.next();
	String ans = "Yes";
	if(str.length() % 2 == 1) {
		ans = "No";
	}
	else {
		for(int i = 0; i < str.length()-1; i=i+2) {
			if(str.charAt(i) == 'h' && str.charAt(i+1) == 'i') {

			}
			else {
				ans = "No";
				break;
			}
		}
	}
	System.out.println(ans);

	// 後始末
	sca.close();
	}
}