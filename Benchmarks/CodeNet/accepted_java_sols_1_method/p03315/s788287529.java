import java.util.*;

class Main{

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		
		String S = sc.next();

		int ans = 0;

		for(int i = 0; i<4; i++){
		if(S.charAt(i) == '-') ans--;
		if(S.charAt(i) == '+') ans++;
		}
		System.out.println(ans);
	}
}