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
    int X;
    int Y;
    
    //入力
    Main(Scanner sc) {
        this.sc = sc;
        this.X = sc.nextInt();
        this.Y = sc.nextInt();
    }
    
    //解答処理
    private String solve() {
        String answer = "No";
        int total = X * 4; //全てカメだった場合の足の本数
        
        if (total == Y) {
        	answer = "Yes";
        } else {
        	while (total > Y) {
        		total -= 2;
        	}
        	if (total == Y) {
        		answer = "Yes";
        	}
        }
        
        return answer;
    }
    
    //出力
    public void show(String answer) {
        System.out.println(answer);
    }

}
