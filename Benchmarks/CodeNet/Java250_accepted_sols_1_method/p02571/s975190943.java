import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		
		Scanner in = new java.util.Scanner(System.in);
		char[] S = in.next().toCharArray();
		char[] T = in.next().toCharArray();
		int min = T.length;
		int diff;
		for(int i=0; i<=S.length-T.length; i++) {
			diff = 0;
			for(int j=0; j<T.length; j++) {
				if(S[i+j] != T[j]) {
					diff++;
				}
			}
			if(min > diff) {
				min = diff;
			}
		}
		
		System.out.println(min);
		
		
		in.close();
	}
}
