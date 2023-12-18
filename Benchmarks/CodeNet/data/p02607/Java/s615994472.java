import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Main m = new Main(sc);
        m.show(m.solve());
    }
    
    Scanner sc;
    int N;
    int[] a;
    int answer;
    
    //入力
    Main(Scanner sc) {
        this.sc = sc;
        N = sc.nextInt();
        a = new int[N];
        for (int i=0; i<N; ++i){
            a[i] = sc.nextInt();
        }
    }
    
    //解答処理
    int solve() {
        for (int i=0; i<N; ++i){
            if (i % 2 == 1 && a[i] % 2 == 1){
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