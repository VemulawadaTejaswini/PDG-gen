import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		String S = sc.next();
		String T = "";
		if(S.length()<=K) {
			T = S;
		}else {
			for(int i=0; i<K; i++) {
					T += S.charAt(i);
			}
			T += "...";
		}
		sc.close();
		System.out.println(T);
	}

}