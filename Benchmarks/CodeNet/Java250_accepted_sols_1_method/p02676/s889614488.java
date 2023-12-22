//package atcoder;
 
import java.util.*;
 
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		String S = sc.next();
		char s[] = new char[S.length()];
		
		for(int i=0;i<S.length();i++) {
			s = S.toCharArray();
			//System.out.println(s[i]);
		}
		
		
		if(S.length()<=K) {
			System.out.println(S);
		}
		if(S.length()>K){
			for(int j=0;j<K;j++) {
				{
					System.out.print(s[j]);
					//System.out.print("...");
				}
			}System.out.print("...");
		}
		
	}
	
}