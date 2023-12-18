import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String W =sc.next();
		int cnt=0;

		while(true){
			String str =sc.next();

			if(str.equals("END_OF_TEXT")) {
				break;
			}
			String small = str.toLowerCase();
			if(small.matches(W)) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}
