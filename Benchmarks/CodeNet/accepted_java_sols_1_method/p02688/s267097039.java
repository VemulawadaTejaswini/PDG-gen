import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // ----------入力受付-----------//
        int N = sc.nextInt();               // 人数
        int K = sc.nextInt();               // お菓子の種類

        // -------状態を記憶する配列定義---------//
        boolean[] tricked = new boolean[N]; // お菓子を持っていない人はtrue
        Arrays.fill(tricked, true);         // 全員の初期状態としてtrueを指定

        // -----Aの入力より状態を記憶-----------//
        for (int i=0;i<K;i++){              // お菓子一種類ごとに確かめる
            int d = sc.nextInt();           // お菓子を持っている人数
            for(int j=0;j<d;j++){
                int a = sc.nextInt();       // お菓子iを持っている人はフラグを下ろす
                tricked[a-1]=false;
            }
        }
        //----------数える--------//
        int cnt = 0;                        // カウント用変数
        for(int l=0; l<N;l++){
            if(tricked[l]){                  // お菓子を受け取っていない人をカウント
                cnt++;
            }
        }
        //-----------出力----------//
        System.out.println(cnt);
    }
}