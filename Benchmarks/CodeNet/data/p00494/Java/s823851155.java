import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] in = sc.next().toCharArray();
		int max = 0;
		int jsum = 0;
		int osum = 0;
		int isum = 0;
		for(int i = 0; i < in.length; i++) {
			if(in[i] == 'J') {
				jsum++;
				osum = 0;
				isum = 0;
			}
			if(in[i] == 'O') {
				osum++;
				isum = 0;
			}
			if(in[i] == 'I') {
				isum++;
			}
			if(i != 0 && in[i] == 'J' && in[i-1] != 'J') jsum = 0;
			if(i != 0 && in[i] == 'O' && in[i-1] == 'I') {
				jsum = 0;
				osum = 0;
				isum = 0;
			}
			if(i != 0 && in[i] == 'I' && in[i-1] == 'J') {
				jsum = 0;
				osum = 0;
				isum = 0;
			}
			if(jsum >= osum && isum >= osum) max = Math.max(osum, max);
			
		}
		System.out.println(max);
	}

	
}