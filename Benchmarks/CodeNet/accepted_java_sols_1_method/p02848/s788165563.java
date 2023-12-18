import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.nextLine();
		String S = sc.nextLine();
		String Out = "";
		for(int i = 0; i < S.length(); i++) {
			int temp = S.charAt(i);
			temp = temp + N;
			if(temp > 90) {
				temp = temp - 26;
			}
			Out = Out + (char)temp;
		}
		System.out.println(Out);
	}
}
