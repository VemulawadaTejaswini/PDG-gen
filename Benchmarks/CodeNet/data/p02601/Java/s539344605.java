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
    int B;
    int C;
    int K;
    
    //入力
    Main(Scanner sc) {
        this.sc = sc;
        this.A = sc.nextInt();
        this.B = sc.nextInt();
        this.C = sc.nextInt();
        this.K = sc.nextInt();
    }
    
    private boolean solve() {
    	boolean judge = false;
    	
    	for (int i=1; i<=K; i++) {
    		if (A >= B) {
    			B = B * 2;
    		} else if (C <= B) {
    			C = C * 2;
    		}
    	}
    	
    	if (A < B && B < C) {
    		judge = true;
    	}
        
        return judge;
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
