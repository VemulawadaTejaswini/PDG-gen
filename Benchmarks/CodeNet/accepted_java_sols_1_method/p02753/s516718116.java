import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

	Scanner sca = new Scanner(System.in);
	String str = sca.next();
	String ans = "No";
	for(int i = 0; i < str.length()-1; i++) {
		if(str.charAt(i) == 'A' && str.charAt(i+1) == 'B') {
			ans = "Yes";
			break;
		}
		else if(str.charAt(i) == 'B' && str.charAt(i+1) == 'A') {
			ans = "Yes";
			break;
		}
		else {

		}
	}
	//ArrayList<> list = new ArrayList<>();
	System.out.println(ans);

	// 後始末
	sca.close();
	}
}