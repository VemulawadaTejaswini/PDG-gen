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
    long A;
    long V;
    long B;
    long W;
    long T;
    
    //入力
    Main(Scanner sc) {
        this.sc = sc;
        this.A = sc.nextLong();
        this.V = sc.nextLong();
        this.B = sc.nextLong();
        this.W = sc.nextLong();
        this.T = sc.nextLong();
    }
    
    //解答処理
    private boolean solve() {
        boolean judge = false;
        
        A = A + V*T;
        B = B + W*T;
        if (A >= B) {
        	judge = true;
        }
        
        return judge;
    }
    
    //出力
    public void show(boolean answer) {
        if (answer) {
        	System.out.println("YES");
        } else {
        	System.out.println("NO");
        }
    }

}
