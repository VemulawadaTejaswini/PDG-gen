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
    int[] L;
    
    //入力
    Main(Scanner sc) {
        this.sc = sc;
        N = sc.nextInt();
        L = new int[N];
        for (int i=0; i<N; i++) {
        	L[i] = sc.nextInt();
        }
    }
    
    //解答処理
    private boolean solve() {
        boolean judge = false;
        Arrays.sort(L);
        int max = L[N-1];
        int total = 0;
        for (int i=0; i<L.length-1; i++) {
        	total += L[i];
        }
        
        if (max < total) {
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