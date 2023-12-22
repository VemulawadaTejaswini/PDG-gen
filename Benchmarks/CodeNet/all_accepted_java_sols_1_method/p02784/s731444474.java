import java.util.*;
public class Main {
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

      int HP = sc.nextInt();//モンスターHP
      int N = sc.nextInt();//必殺技の種類
           
      //必殺技でHPを減らしていく
      for(int i = 1; i<=N; i++){
        int hit = sc.nextInt();
        HP -= hit;       
      }  
      //HPが0以下かどうか出力
       System.out.print(HP<=0 ? "Yes":"No");
    }
}