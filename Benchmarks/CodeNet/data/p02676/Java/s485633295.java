import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		String S = sc.next();
		String[] ary = S.split("");
		sc.close();
		String res = "";
		if (S.length() <= K) {
			System.out.println(S);
		} else{
			for (int i = 0; i < K; i++){
			res = res + ary[i];
			}
		System.out.println(res + "...");
		}
	}
}