import java.util.*;

public class Main {
	
	public static void main(String[] args) {

		// argumentの取得
		Scanner s = new Scanner(System.in);

		int N = s.nextInt();
        String S = s.next();
        String T = s.next();
      
        // answer
        StringBuilder answer = new StringBuilder();
      
        for (int i=0; i < N; i++){
          answer.append(String.valueOf(S.charAt(i)));
          answer.append(String.valueOf(T.charAt(i)));
        }
           
		// 戻り値の返却
		System.out.println(answer);
	
	} 
}