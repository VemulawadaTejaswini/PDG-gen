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
    int L;
    String[] S;
    
    //入力
    Main(Scanner sc) {
        this.sc = sc;
        this.N = sc.nextInt();
        this.L = sc.nextInt();
        S = new String[N];
        for (int i=0; i<N; i++) {
        	S[i] = sc.next();
        }
    }
    
    //解答処理
    private String solve() {
    	Arrays.sort(S);
    	
        String answer = null;
        StringBuilder sb = new StringBuilder(); 
        for (int i=0; i<N; i++) {
        	StringBuilder tmp = new StringBuilder(S[i]);
        	sb.append(tmp);
        }
        
        answer = sb.toString();
        return answer;
    }
    
    //出力
    public void show(String answer) {
        System.out.println(answer);
    }

}
