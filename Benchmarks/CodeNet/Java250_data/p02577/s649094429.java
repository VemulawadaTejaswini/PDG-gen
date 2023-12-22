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
    String N;
    
    //入力
    Main(Scanner sc) {
        this.sc = sc;
        this.N = sc.next();
    }
    
    //解答処理
    private String solve() {
        String answer = "No";
        long m = 0;
        if (!N.equals("0")) {
        	for (int i=0; i<N.length(); i++) {
        		int tmp = N.charAt(i);
        		m += tmp-48;
        	}
        }
        
        if (m%9 == 0) {
        	answer = "Yes";
        }
        
        return answer;
    }
    
    //出力
    public void show(String answer) {
        System.out.println(answer);
    }

}
