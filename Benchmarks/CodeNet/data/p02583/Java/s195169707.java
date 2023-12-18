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
        this.N = sc.nextInt();
        L = new int[N];
        for (int i=0; i<N; i++) {
        	L[i] = sc.nextInt();
        }
    }
    
    //解答処理
    private int solve() {
        int answer = 0;
       
        for (int i=0; i<N; i++) {
        	for (int j=i+1; j<N; j++) {
        		for (int k=j+1; k<N; k++) {
        			if (L[i]!=L[j] && L[j]!=L[k] && L[i]!=L[k] && isTriangle(L[i],L[j],L[k])) {
        				answer++;
        			}
        		}
        	}
        }
        
        return answer;
    }
    
    //三辺の長さがL[i],L[j],L[k]の三角形が存在するか判定するメソッド
    private boolean isTriangle(int i, int j, int k) {
    	boolean judge = false;
    	if (i+j>k && j+k>i && k+i>j) {
    		judge = true;
    	}
    	
    	return judge;
    }
    
    //出力
    public void show(int answer) {
        System.out.println(answer);
    }

}
