import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String S = sc.next();
		char a[] = new char[4];

		for(int i=0;i<S.length();i++) {
			a[i] = S.charAt(i);
		}
		for(int k=0;k<3;k++) {
			if(a[k+1]==a[k]) {System.out.println("Bad");
			return;}
		}
		System.out.println("Good");
	}
}
