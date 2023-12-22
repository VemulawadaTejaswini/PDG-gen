import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		
		String[] S = new String[H];
		
		for(int i = 0; i < H; i++) {
			String s = sc.next();
			S[i] = "#" + s + "#";
		}
		
		String T = "";
		
		for(int i = 0; i < S[0].length(); i++) {
			T += "#";
		}
		
		System.out.println(T);
		
		for(int i = 0; i < H; i++) {
			System.out.println(S[i]);
		}
		
		System.out.println(T);
	}
}
