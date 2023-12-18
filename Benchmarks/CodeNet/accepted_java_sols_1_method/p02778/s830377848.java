import java.util.*;

class Main{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		String S = sc.next();

		int cnt = S.length();

		String ans = "";

		for(int i = 0; i<cnt; i++){
			ans += "x";
		}

		System.out.println(ans);

	}
}