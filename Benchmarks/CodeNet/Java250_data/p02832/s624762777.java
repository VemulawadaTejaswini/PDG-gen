import java.util.ArrayList;
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
    ArrayList<Integer> a = new ArrayList<Integer>();
    
    //入力
    Main(Scanner sc) {
        this.sc = sc;
        this.N = sc.nextInt();
    }
    
    //解答処理
    private int solve() {
    	int brick = 0; //砕くレンガの数
    	int count = 1;//残ったレンガの要素数
    	
    	for (int i=0; i<N; i++) {
    		int tmp = sc.nextInt();
        	if (count != tmp) {
        		brick++;
        	} else {
        		a.add(tmp);
        		count++;
        	}
        }
    	
        if (brick == N) {
        	brick = -1;
        }
        return brick;
    }
    
    //出力
    public void show(int answer) {
        System.out.println(answer);
    }

}
