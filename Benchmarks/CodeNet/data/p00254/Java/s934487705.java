import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);
        int N;
        
        while (true){
            N = input.nextInt();//入力
            
            if (N == 0) break; //0000の時終了
            
            if (N % 1111 == 0){
                //全ての桁の数が同じとき
                System.out.println("NA");
                continue;
            }
            
            int count = 0;
            
            while (N != 6174){
                int L, S;
                
                int[] num = new int[4];
                
                //Nを1文字ずつ読み込み
                for (int i = 0; i < 4; i++){
                    num[i] = N % 10;
                    N = N / 10;
                }
                
                //並べ替え
                Arrays.sort(num);
                //System.out.println(N);
                
                L = S = 0;
                for(int i = 0; i < 4; i++){
                    S = S * 10 + num[i];     //Nの桁それぞれの数値を大きい順に並べた結果取得
                    L = L * 10 + num[3 - i]; //Nの桁それぞれの数値を小さい順に並べた結果取得
                }
                //System.out.println(L);
                //System.out.println(S);
                
                N = L - S; //差 L-S を新しい N とする(1回分の操作終了)
                //System.out.println(N);
                
                count++;
            }
        System.out.println(count);
            
        }
    }
}

