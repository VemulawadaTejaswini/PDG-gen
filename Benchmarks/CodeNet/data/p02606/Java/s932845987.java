import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Main m = new Main(sc);
        m.show(m.solve());
    }
    
    Scanner sc;
    int L;
    int R;
    int d;
    int answer;
    
    //入力
    Main(Scanner sc) {
        this.sc = sc;
        L = sc.nextInt();
        R = sc.nextInt();
        d = sc.nextInt();
    }
    
    //解答処理
    int solve() {
        for (int i=L; i<R+1; ++i){
            if (i % d == 0){
                ++answer;
            }
        }
        
        return answer;
    }
    
    //出力
    void show(int answer) {
        System.out.print(answer);
    }
}