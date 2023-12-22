import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		char[] ch = scn.nextLine().toCharArray();
		int k = ch.length;
		int ans = 0;
		for(int i = 0;i < k;i++) {
			if(ch[i] == 'o') {
				ans++;
			}
		}
		System.out.println((15-k + ans>=8)?"YES":"NO");
		}

}
