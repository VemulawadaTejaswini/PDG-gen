
import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner in = new java.util.Scanner(System.in);
		char[] S = in.nextLine().toCharArray();
		char[] T = in.nextLine().toCharArray();
		
		int count = 0;
		for(int i=0; i<S.length; i++) {
			count = 0;
			
			for(int j=0; j<T.length - i; j++) {
				if((int)S[j] == (int)T[j+i]) {
					count++;
				}else {
					break;
				}
			}
			for(int j=T.length-i, k=0; j<T.length; j++,k++) {
				if((int)S[j] == (int)T[k]) {
					count++;
				}else {
					break;
				}
			}
			if(count == S.length) {
				System.out.print("Yes");
				System.exit(0);
			}
		}
		System.out.print("No");
		
	}
}