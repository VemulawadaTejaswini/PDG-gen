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
    int N;
    int A;	//電車
    int B;	//タクシー
    
    //入力
    Main(Scanner sc) {
        this.sc = sc;
        N = sc.nextInt();
        A = sc.nextInt();
        B = sc.nextInt();
    }
    
    //解答処理
    private int solve() {
        
    	A *= N;
    	
    	int min = Math.min(A, B);
        return min;
    }
    
    //出力
    public void show(int answer) {
        System.out.println(answer);
    }

}