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
        String answer = null;
        int n = Integer.parseInt(N.substring(N.length()-1, N.length()));
        if (n==2 || n==4 || n==5 || n==7 || n==9 ) {
        	answer = "hon";
        } else if (n==0 || n==1 || n==6 || n==8){
        	answer = "pon";
        } else if (n==3){
        	answer = "bon";
        }
        
        return answer;
    }
    
    //出力
    public void show(String answer) {
        System.out.println(answer);
    }

}
