import java.util.ArrayList;
import java.util.List;
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
    int[] A;
    
    //入力
    Main(Scanner sc) {
        this.sc = sc;
        this.N = sc.nextInt();
        this.K = sc.nextInt();
        A = new int[N];
        for (int i=0; i<N; i++) {
        	A[i] = sc.nextInt();
        	
        }
    }
    
    //解答処理
    private List<Boolean> solve() {
    	List<Boolean> judge = new ArrayList<Boolean>();
        
        for (int i=K; i<N; i++) {
        	if (A[i] > A[i-K]) {
        		judge.add(true);
        	} else {
        		judge.add(false);
        	}
        }
        
        return judge;
    }
    
    //出力
    public void show(List<Boolean>answer) {
    	for (int i=0; i<answer.size(); i++) {
    		if (answer.get(i)) {
    			System.out.println("Yes");
    		} else {
    			System.out.println("No");
    		}
    	}
        
    }

}
