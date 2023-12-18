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
    int X;
    int T;
    
    //入力
    Main(Scanner sc) {
        this.sc = sc;
        this.N = sc.nextInt();
        this.X = sc.nextInt();
        this.T = sc.nextInt();
    }
    
    //解答処理
    private long solve() {
        long answer = T;
        int takoyaki = 0;
        
        for (int i=1; takoyaki<N; i++) {
        		answer = T * i;
        		takoyaki += X;
        }
        
        return answer;
    }
    
    //出力
    public void show(long answer) {
        System.out.println(answer);
    }

}
