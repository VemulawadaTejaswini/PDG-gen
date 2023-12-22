import java.util.*;
public class Main {
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

      int HP = sc.nextInt();//モンスターHP
      int N = sc.nextInt();//必殺技の種類
      int sum = 0;//必殺技の和
           
      //各必殺技を足す
      for(int i = 1; i<=N; i++){
        int hit = sc.nextInt();
        sum += hit;       
      }  
      //必殺技の和でモンスターを倒せるか
       System.out.print( sum>=HP ? "Yes":"No");
    }
}