import java.util.*;
public class Main {
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

      //入力
      int M =sc.nextInt();//モンスターの数
      int killhit =sc.nextInt();//必殺技回数
      long hp[] = new long[M];
      long ans =0;
      
      //各モンスターのHPを配列に
      for(int i=0; i<M; i++){
        hp[i] = sc.nextLong();
      }
      //HPを昇順に
      Arrays.sort(hp);
      
      //攻撃だけの回数をループ
      for(int i=0; i<M-killhit; i++){
          	ans += hp[i];
      }
          	System.out.println(ans);
    }
}