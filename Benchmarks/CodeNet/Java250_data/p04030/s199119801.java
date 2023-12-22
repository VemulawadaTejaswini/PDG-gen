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
    String s;
    
    //入力
    Main(Scanner sc) {
        this.sc = sc;
        this.s = sc.next();
    }
    
    //解答処理
    private String solve() {
        String answer = "";
        for (int i=0; i<s.length(); i++) {
        	if (s.charAt(i) == '0') {
        		answer += "0";
        	} else if (s.charAt(i) == '1') {
        		answer += "1";
        	} else if (s.charAt(i) == 'B' && answer.length() >= 1) {
        		answer = answer.substring(0,answer.length()-1);
        	}
        }
        
        return answer;
    }
    
    //出力
    public void show(String answer) {
        System.out.println(answer);
    }

}
