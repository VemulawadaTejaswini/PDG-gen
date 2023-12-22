import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int minA = S.length();
		int maxX = 0;

		for(int i=0;i<S.length();i++) {
			if(S.charAt(i)=='A' && i<=minA) {
				minA=i;
			}else if(S.charAt(i)=='Z' && i>=maxX){
				maxX = i;
			}
		}
		System.out.println(maxX-minA+1);


	}
	public static int sample(int n) {
		return n;
	}

}
