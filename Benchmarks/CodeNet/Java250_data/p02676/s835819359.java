import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scn = new Scanner(System.in);
		int K = scn.nextInt();
		String S = scn.next();

		char[] moji = new char[S.length()];

	    for(int i = 0; i < S.length(); i++){
	            moji[i] = S.charAt(i);
	    }
	    if(S.length()>K) {
	    	for(int i =0; i<K; i++) {
	    		System.out.print(moji[i]);
	    	}
	    	System.out.println("...");
	    }else {
	    	System.out.println(S);
	    }

}
}