import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String T = sc.next();
		if(S.equals(T)) {
			System.out.println(0);
			return;
		}
		int count =0;
		for(int i =0;i<S.length();i++) {
			if(!S.substring(i,i+1).equals(T.substring(i,i+1))) {
				count++;
			}
		}

		System.out.println(count);
	}
}