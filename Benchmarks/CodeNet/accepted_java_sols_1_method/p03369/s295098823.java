import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int count = 700;
		for(int i=0; i<3; i++) {
			char S1 = S.charAt(i);
			if(S1== 'o') {
				count = count + 100;
			}
		}
		System.out.println(count);
	}

}
