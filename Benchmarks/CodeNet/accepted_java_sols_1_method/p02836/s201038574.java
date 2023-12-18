import java.util.Scanner;

class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String S = sc.next();

		int count = 0;
		for(int i=0 ; i<S.length()/2; i++) {
			if(S.substring(i, i+1).equals(S.substring(S.length()-i-1,S.length()-i))) {
				continue;
			} else {
				count++;
			}
		}
		System.out.println(count);
	}
}
