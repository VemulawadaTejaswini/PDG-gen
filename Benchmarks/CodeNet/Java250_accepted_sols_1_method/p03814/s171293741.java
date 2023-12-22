import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		char[] ary = S.toCharArray();
		int A = 0;
		int B = 0;

		for(int i = 0; i < ary.length; i++) {
			if(ary[i] == 'A') {
				A = i;
				break;
			}
		}
		for(int j = ary.length-1; j > 0; j--) {
			if(ary[j] == 'Z') {
				B = j;
				break;
			}
		}
		System.out.println(B-A+1);
	}

}
