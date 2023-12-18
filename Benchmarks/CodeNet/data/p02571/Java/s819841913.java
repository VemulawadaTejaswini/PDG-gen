import java.util.*;
public class Main {
	public static void main(String[] args){
    /*
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
		// スペース区切りの整数の入力
		int b = sc.nextInt();
		int c = sc.nextInt();
		// 文字列の入力
		String s = sc.next();
    */
    /*--------------------------------*/
    //入力
    String s = "codeforces";
		String t = "atcoder";

		int n = s.length() -t.length() +1;// 比較回数

		String[] sS = new String[s.length()];
		String[] sT = new String[t.length()];

		for (int i = 0; i < s.length(); i++) {
    // strの先頭から1文字ずつString型にして取り出す
    String s2 = String.valueOf(s.charAt(i));
    // 配列に順番に格納する
    sS[i] = s2;
		}

		for (int i = 0; i < t.length(); i++) {
    // strの先頭から1文字ずつString型にして取り出す
    String t2 = String.valueOf(t.charAt(i));
    // 配列に順番に格納する
    sT[i] = t2;
		}
		//answer
	//	System.out.println(sS[0]);
		int c = 0;
		int ans =0;
		for(int i=0;i<n;i++){
			c = 0;
			for(int j=0;j<t.length();j++){
				if(sS[i+j].equals(sT[j])){
					c++;
				}
				//	System.out.print(sS[i+j]);
					//	System.out.print(sT[j]);
						//System.out.println(c);
			}
		}
			if(ans<c){
				ans = c;
			}

		System.out.println(t.length() - ans);
	}
}
