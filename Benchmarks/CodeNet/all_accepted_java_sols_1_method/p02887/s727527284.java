import java.util.*;

public class Main {
	
	static int change = 0;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		StringBuilder sb = new StringBuilder();
		
		int N = sc.nextInt();
		
		String S = sc.next();
		
		char[] sChar = S.toCharArray();
		
		int ans = 0;
		
		for(int i = 0 ; i < N-1 ; i++) {
			if(sChar[i] != sChar[i+1]) {
				ans++;
			}
		}
		
        System.out.println(ans+1);
	}

}
