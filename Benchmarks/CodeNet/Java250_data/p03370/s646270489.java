import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Main m = new Main(sc);
        m.show(m.solve());
    }
    
    Scanner sc;
    int N;
    int X;
    int[] m;
    
    //入力
    Main(Scanner sc) {
        this.sc = sc;
        N = sc.nextInt();
        X = sc.nextInt();
        m = new int[N];
        //for (int i=0; i<N; ++i){
        //    m[i] = sc.nextInt();
        //}
    }
    
    //解答処理
    int solve() {
        int count =0;
        
        for (int i=0; i<N; ++i){
            m[i] = sc.nextInt();
            X -= m[i];
            count++;
        }
        
        Arrays.sort(m); //昇順にソート
        while (m[0] <= X){
            X -= m[0];
            count++;
        }
        
        
        return count;
    }
    
    //出力
    void show(int answer) {
        System.out.println(answer);
    }
}
