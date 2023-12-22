import java.util.*;

class Main{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		String S =sc.next();
		String ans = "AC";
		int cnt = 0;

		if(S.charAt(0) != 'A') ans = "WA";

		for(int i = 1; i < S.length(); i++){
			if(S.charAt(i) < 'a'){
				if(i == 1 || i == S.length() -1){
					ans = "WA";
				} else if(S.charAt(i) == 'C'){
				}
				cnt++;
			}
		}
		if(cnt != 1) ans = "WA";
		
		
			System.out.println(ans);

	}

}