import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		char[] N = S.toCharArray();
		String P = "yes";
		for(int i = 0;i < N.length;i++) {
			for(int k = i+1;k < N.length;k++) {
				if(N[i] == N[k])P = "no";
			}
		}
		System.out.println(P);
	}

}