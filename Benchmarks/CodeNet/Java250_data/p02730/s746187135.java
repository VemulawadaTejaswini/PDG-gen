import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Main m = new Main(sc);
        m.show(m.solve());
        sc.close();
    }
    
	//フィールド
    Scanner sc;
    String S;
    
    //入力
    Main(Scanner sc) {
        this.sc = sc;
        S = sc.next();
    }
    
    //解答処理
    private boolean solve() {
    	boolean judge = false;
    	int N = S.length();
      
    	if (Palindrome(S.substring(0, N/2)) && Palindrome(S.substring(N/2+1, N)) && Palindrome(S)) {
    		judge = true;
    	}
         
        return judge;
    }
    
    private boolean Palindrome(String str) {	//回文か判定するメソッド
    	boolean kaibun = false;
    	StringBuilder reverses = new StringBuilder(str).reverse();
    	String reverseS = reverses.toString();
    	
    	if (str.equals(reverseS)) {
    		kaibun = true;
    	}
    	
    	return kaibun;
    }
    
    //出力
    public void show(boolean answer) {
        if (answer) {
        	System.out.println("Yes");
        } else {
        	System.out.println("No");
        }
    }

}
