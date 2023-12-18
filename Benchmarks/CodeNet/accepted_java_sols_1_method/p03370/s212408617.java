import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int[] m = new int[N];
        
        //初期化
        for(int i = 0; i < N; i++){
            m[i] = sc.nextInt();
        }
        
        //お菓子を最低一種類ずつ作り、Xの残りを算出
        for(int i = 0; i < N; i++){
            X -= m[i];
        }
        
        //m[i]の中で一番少ない量で出来るドーナツを抽出。
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < N; i++){
            min = Math.min(min,m[i]);
        }
    
        //最初に作った各一個を忘れないようにカウント。
        System.out.println(N + (X / min));
    }
}
