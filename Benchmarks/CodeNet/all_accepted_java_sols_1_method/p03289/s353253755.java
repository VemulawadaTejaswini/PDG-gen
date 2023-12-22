import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String s = sc.next();

		if (s.charAt(0) != 'A'){
			System.out.println("WA");
			return;
		}
		int cCnt = 0;
		int cIndex = 0;
		for (int i = 2; i < s.length() -1; i++){
			char c = s.charAt(i);
			if (c == 'C'){
				cCnt++;
				cIndex = i;
			}
		}
		if (cCnt != 1){
			System.out.println("WA");
			return;
		}
		for (int i = 1; i < s.length(); i++){
			if (i != cIndex){
				if (!Character.isLowerCase(s.charAt(i))){
					System.out.println("WA");
					return;
				}
			}
		}
		System.out.println("AC");
	}
}