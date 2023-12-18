import java.util.Arrays;
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
    int K;
    int[] p;
    
    //入力
    Main(Scanner sc) {
        this.sc = sc;
        this.N = sc.nextInt();
        this.K = sc.nextInt();
        this.p = new int[N];
        for (int i=0; i<N; i++) {
        	p[i] = sc.nextInt();
        }
    }
    
    //解答処理
    private int solve() {
        Arrays.sort(p);
    	int answer = 0;
        for (int i=0; i<K; i++) {
        	answer += p[i];
        }
        
        return answer;
    }
    
    //出力
    public void show(int answer) {
        System.out.println(answer);
    }

}
