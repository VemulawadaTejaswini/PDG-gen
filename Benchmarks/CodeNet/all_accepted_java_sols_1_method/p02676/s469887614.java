import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		String S = sc.next();
		if(S.length() > K){
			S = S.substring(0 , K);
			S = S + "...";
		}
		System.out.println(S);
	}
}
