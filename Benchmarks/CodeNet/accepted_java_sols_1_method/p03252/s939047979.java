import java.util.Arrays;
import java.util.Scanner;

class Main{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int[] cntS = new int['z' - 'a' + 1];
		int[] cntT = new int['z' - 'a' + 1];
		String S = sc.next(), T = sc.next();

		for(int i = 0; i < S.length(); i++) cntS[S.charAt(i) - 'a']++;
		for(int i = 0; i < T.length(); i++) cntT[T.charAt(i) - 'a']++;
		Arrays.sort(cntS); Arrays.sort(cntT);
		boolean flg = true;

		for(int i = 0; i < cntS.length; i++) {
			if(cntS[i] != cntT[i]) flg = false;
		}
		System.out.println(flg ? "Yes" : "No");
	}
}