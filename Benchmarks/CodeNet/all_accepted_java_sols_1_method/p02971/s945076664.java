import java.util.*;
public class Main {
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
      
      //入力
      int N = sc.nextInt();//数列の長さ
      
      int youso1[] = new int[N];
      //int youso2[] = new int[N];
      
      //数列作成
      for(int i=0; i<N; i++){
        	youso1[i] = sc.nextInt();
      }
      //数列のコピーを作成
      int[] youso2 = youso1.clone();
      
      //昇順に並び替え 
      Arrays.sort(youso2);
      
      /*昇順にした数列の最後は最大値であるため
      元の数列で比較し昇順の数列で出力する*/
      for(int i=0; i<N; i++){
      		if(youso1[i] < youso2[N-1]){
              	System.out.println(youso2[N-1]);
            }
        	else /*if (youso1.get(i) == youso1.get(youso1.size()-1)) */{
              	System.out.println(youso2[N-2]);
            }
      }
    }
}