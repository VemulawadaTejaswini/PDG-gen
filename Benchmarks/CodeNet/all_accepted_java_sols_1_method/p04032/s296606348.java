import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		char[] s = sc.next().toCharArray();
		A:switch(s.length) {
		case 2:
			if(s[0] == s[1]) {
				System.out.print("1 2");
			}else {
				System.out.print("-1 -1");
			}
			break;
		default:
			for(int i = 0; i + 2 < s.length; i++) {
				if(s[i] == s[i+1] || s[i] == s[i+2] || s[i] == s[i+2]) {
					System.out.printf("%d %d",i+1,i+3);
					break A;
				}
			}
			System.out.print("-1 -1");
		}
		sc.close();
	}

}