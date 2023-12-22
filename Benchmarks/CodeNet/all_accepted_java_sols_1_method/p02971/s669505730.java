import java.util.*;
public class Main {
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
      
      //入力
      int N = sc.nextInt();//数列の長さ
      
      List<Integer>youso1 = new ArrayList<>();
      //List<Integer>youso2 = new ArrayList<>();
      
      //数列のlist作成
      for(int i=0; i<N; i++){
        	youso1.add(sc.nextInt());  	
      }
      //数列のコピーを作成
      ArrayList<Integer> youso2 = new ArrayList(youso1);
      
      //２つ目のlistを昇順に並び替え
      //昇順のlistと普通のlistを用意しておく
      Collections.sort(youso2);
      
      /*昇順にしたlistの最後は最大値であるため
      元のlistで比較し昇順のlistで出力する*/
      for(int i=0; i<N; i++){
        
      		if(youso1.get(i) < youso2.get(youso2.size()-1)){
              	System.out.println(youso2.get(youso2.size()-1));

            }
        	else /*if (youso1.get(i) == youso1.get(youso1.size()-1)) */{
              	System.out.println(youso2.get(N-2));
              
            }
      }
      
    }
}
