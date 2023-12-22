import java.util.*;
public class Main {
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

      //入力
      int m =sc.nextInt();//モンスターの数
      int waza =sc.nextInt();//必殺技回数
      
      //HPリストの空箱用意
      ArrayList<Long>hp=new ArrayList<>();
      
      //HPリスト作成
      for(int i=0; i<m; i++){
      		hp.add(sc.nextLong());
      }
      
      //HPリストの中を降順に
      Collections.sort(hp, Collections.reverseOrder());
      
      long kougeki =0;//攻撃のみの回数(初期値)
      
      //必殺技だけでモンスターを倒せるとき
      if(m<waza){
        	System.out.println(0);
        	return;
      }
      
      //必殺技を除いた攻撃回数を求める
      for(int i=waza; i<m; i++){
        	kougeki += hp.get(i);
      }
      
      System.out.println(kougeki);

    }
}