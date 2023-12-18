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
    int A;
    int V;
    int B;
    int W;
    int T;
    
    //入力
    Main(Scanner sc) {
        this.sc = sc;
        this.A = sc.nextInt();
        this.V = sc.nextInt();
        this.B = sc.nextInt();
        this.W = sc.nextInt();
        this.T = sc.nextInt();
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
