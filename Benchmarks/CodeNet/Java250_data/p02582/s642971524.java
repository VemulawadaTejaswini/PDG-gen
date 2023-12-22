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
    String S;
    
    //入力
    Main(Scanner sc) {
        this.sc = sc;
        this.S = sc.next();
    }
    
    //解答処理
    private int solve() {
        int answer = 0;
        int count = 0;
        
        for (int i=0; i<S.length()-1; i++) {
        	if (S.charAt(i)=='R' || S.charAt(2)=='R') {
        		answer = 1;
        	}
        	if (S.charAt(i)=='R'&&S.charAt(i+1)=='R') {
        		count++;
        	}
        }
        
        if (count==1) {
        	answer = 2;
        }else if (count==2){
        	answer = 3;
        }
        return answer;
    }
    
    //出力
    public void show(int answer) {
        System.out.println(answer);
    }

}
