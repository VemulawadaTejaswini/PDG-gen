import java.util.Scanner;

/**
 * https://abc076.contest.atcoder.jp/tasks/abc076_d
 */
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		char[] S = sc.next().toCharArray();
		char[] T = sc.next().toCharArray();
		sc.close();
		
		boolean f = false;
		for(int s=S.length-T.length; s>=0; s--){
			f = true;
			for(int i=0; i<T.length; i++){
				char c1 = S[s+i];
				char c2 = T[i];
				if(c1!='?'&&c1!=c2){
					f=false;
					break;
				}
			}
			if(f){
				for(int i=0; i<T.length; i++){
					S[s+i] = T[i];
				}
				break;
			}
		}
		
		String ans = "UNRESTORABLE";
		if(f){
			ans = new String(S);
			ans = ans.replaceAll("\\?", "a");
		}
		
		System.out.println(ans);

	}

}