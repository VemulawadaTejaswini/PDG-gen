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
    
    //入力
    Main(Scanner sc) {
        this.sc = sc;
        this.X = sc.nextInt();
    }
    
    //解答処理
    private int solve() {
        int answer = 0;
        
        if (400 <= X && X <= 599) {
        	answer = 8;
        } else if (600 <= X && X <= 799) {
        	answer = 7;
        } else if (800 <= X && X <= 899) {
        	answer = 6;
        } else if (900 <= X && X <= 999) {
        	answer = 5;
        } else if (1000 <= X && X <= 1199) {
        	answer = 4;
        } else if (1200 <= X && X <= 1399) {
        	answer = 3;
        } else if (1600 <= X && X <= 1799) {
        	answer = 2;
        } else if (1800 <= X && X <= 1999) {
        	answer = 1;
        }
        
        return answer;
    }
    
    //出力
    public void show(int answer) {
        System.out.println(answer);
    }

}
