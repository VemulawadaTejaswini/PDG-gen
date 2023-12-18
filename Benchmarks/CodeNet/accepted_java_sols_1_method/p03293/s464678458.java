import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		char[] S = scn.nextLine().toCharArray();
		char[] T = scn.nextLine().toCharArray();
		boolean can = false,b = false;
		for(int i = 0;i < S.length;i++) {
			b = false;
			for(int j = 0;j < S.length;j++) {
				if(S[j] != T[j]) {
					b = true;
					break;
				}
			}
			if(!b) {
				can = true;
				break;
			}else{
				char buf = T[0];
				for(int j = 0;j < T.length-1;j++) {
					T[j] = T[j+1];
				}
				T[T.length-1] = buf;
			}
		}
		System.out.println(can?"Yes":"No");
		scn.close();
	}
}
