import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s =sc.next();
		for(int i = 0;i < s.length();i++) {
			if(s.charAt(i) == 'R') {
				if((i+1) % 2 == 0) {
					System.out.println("No");
					System.exit(0);
				}
			}
			if(s.charAt(i) == 'L') {
				if((i+1) % 2 == 1) {
					System.out.println("No");
					System.exit(0);
				}
			}
		}
		System.out.println("Yes");
		
	}

}
