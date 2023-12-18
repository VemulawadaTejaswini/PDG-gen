import java.util.Scanner;

public class MAin {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int K = scn.nextInt();
		scn.nextLine();
		char[] ch = scn.nextLine().toCharArray();
		if(ch.length > K) {
			for(int i = 0;i < K;i++) {
				System.out.print(ch[i]);
			}
			System.out.print("...");
		}else {
			for(int i = 0;i < ch.length;i++) {
				System.out.print(ch[i]);
			}
		}
	}

}
