import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt(); 
        
        // 入室した順番の配列
        int[] a = new int [N];
        for(int i = 0;i<N;i++){
          
            a[i] = sc.nextInt();
        }
        
        sc.close();

        // 出席番号を入室順に並べた配列
        int[] ans = new int [N];

        // 入室順の配列を元に出席番号配列を作成する
        for (int i = 0;i<N;i++){
            
            // 入室順配列を頭からアクセス→入室順の数値を元に出席番号を埋める
            ans[a[i]-1] = i + 1; 

        }
        
        for (int answer:ans){
            System.out.println(answer);
        }
        
    }
}