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
    int[] A;
    
    //入力
    Main(Scanner sc) {
        this.sc = sc;
        this.N = sc.nextInt();
        A = new int[N];
        for (int i=0; i<N; i++) {
        	A[i] = sc.nextInt();
        }
    }
    
    //解答処理
    private long solve() {
        long answer = 0;
        
        for (int i=1; i<N; i++) {
        	if (A[i] < A[i-1]) {
        		long tmp = A[i-1]-A[i];
        		answer += tmp;
        		A[i] += tmp;	//踏み台の分を身長に加算
        	}
        }
        
        return answer;
    }
    
    //出力
    public void show(long answer) {
        System.out.println(answer);
    }

}
