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
    int M;
    int[] A;
    int[] B;
    
    //入力
    Main(Scanner sc) {
        this.sc = sc;
        this.N = sc.nextInt();
        this.M = sc.nextInt();
        this.A = new int[M];
        this.B = new int[M];
        for (int i = 0; i < M; i++) {
        	this.A[i] = sc.nextInt();
        	this.B[i] = sc.nextInt();
        }
    }
    
    //解答処理
    private int solve() {
        int count = 0;
        boolean[] check = new boolean[N];
        
        for (int i = 0; i < N; i++) {
        	if (check[i]) {
        		count++;
        		continue;
        	}
        	for (int j = 0; j < M; j++) {
        		check[A[j]-1] = true;
        		check[B[j]-1] = true;
        	}
        }
        
        return count;
    }
    
    //出力
    public void show(int answer) {
        System.out.println(answer);
    }

}
