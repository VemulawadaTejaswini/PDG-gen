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
    int[] d;
    
    //入力
    Main(Scanner sc) {
        this.sc = sc;
        this.N = sc.nextInt();
        d = new int[N];
        for (int i = 0; i < N; i++) {
        	this.d[i] = sc.nextInt();
        }
    }
    
    //解答処理
    private int solve() {
        int total = 0;
        
        for (int i = 0; i < N-1; i++) {
        	for (int j = i+1; j < N; j++) {
        		total += d[i] * d[j];
        	}
        }
        
        return total;
    }
    
    //出力
    public void show(int answer) {
        System.out.println(answer);
    }

}
