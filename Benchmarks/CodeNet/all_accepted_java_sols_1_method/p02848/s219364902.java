import java.util.*;
import java.lang.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		String S = sc.next();
		String[] alp = new String[]{"a","A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
		String ans = "a";
		for( int i=0; i<S.length(); i++ ){
			char ch = S.charAt(i);
			String ss = String.valueOf(ch);
			for( int j=1; j<=26; j++ ){
				if( ss.equals(alp[j]) ){
					if( j+N>26 ){
						ans += alp[j+N-26];
						break;
					}else{
						ans += alp[j+N];
						break;
					}
				}
			}
		}
		System.out.println(ans.substring(1));     
	}
}
