import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Main m = new Main(sc);
        m.solve();
        m.show();
        sc.close();
    }
    
	//フィールド
    Scanner sc;
    int N;
    int M;
    int[] p;
    int[] AC;
    int[] WA;
    int countAC = 0;;
    int countWA = 0;
    
    //入力
    Main(Scanner sc) {
        this.sc = sc;
        this.N = sc.nextInt();
        this.M = sc.nextInt();
        p = new int[M];
        AC = new int[N];
        WA = new int[N];
    }
    
    //解答処理
    private void solve() {
        
    	for (int i=0 ;i<M; i++) {
    		p[i] = sc.nextInt();
    		String S = sc.next();
    		if (S.equals("WA")) {
    			WA[p[i]-1]++;
    		} else {
    			//まだその問題でACが出てないとき、ペナルティ分を加算
    			if (AC[p[i]-1] == 0) {
    				countWA += WA[p[i]-1];
    			}
    			AC[p[i]-1] = 1;
    		}
    	}
    	
    	for (int i=0; i<N; i++) {
    		countAC += AC[i];
    	}
        
    }
    
    //出力
    public void show() {
        System.out.print(countAC);
        System.out.print(" ");
        System.out.print(countWA);
    }

}
