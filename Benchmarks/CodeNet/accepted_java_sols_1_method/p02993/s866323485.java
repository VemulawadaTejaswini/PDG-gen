import java.util.Scanner;

class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

//		int S = Integer.parseInt(sc.next());
		String S = sc.next();

		for(int i=0; i<S.length()-1; i++) {
			if(S.substring(i, i+1).equals(S.substring(i+1, i+2))) {
				System.out.println("Bad");
				return;
			}
		}
		System.out.println("Good");
	}
}
