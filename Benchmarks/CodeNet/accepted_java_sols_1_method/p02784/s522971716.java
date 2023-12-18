import java.util.*;
public class Main {
	public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      //モンスター
      int H = sc.nextInt();
      //アライグマ
      int N = sc.nextInt();
      //全部の必殺技を使う
      for(int i=0;i<N;i++){
        H-=sc.nextInt();
      }
      //最終的なモンスターの体力
      if(H<=0){
        System.out.println("Yes");
      }else{
        System.out.println("No");
      }
    }
}