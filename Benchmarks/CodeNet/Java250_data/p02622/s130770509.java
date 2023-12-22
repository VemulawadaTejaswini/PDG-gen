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
    String T;
    
    //入力
    Main(Scanner sc) {
        this.sc = sc;
        this.S = sc.next();
        this.T = sc.next();
    }
    
    //解答処理
    private int solve() {
        int count = 0;
        if (!(S.equals(T))) {
        	for (int i=0; i<S.length(); i++) {
        		if (S.charAt(i) != T.charAt(i)) {
        			count++;
        		}
        	}
        }
        
        return count;
    }
    
    //出力
    public void show(int answer) {
        System.out.println(answer);
    }

}
