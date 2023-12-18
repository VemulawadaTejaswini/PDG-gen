import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
      
      //入力
      int N =sc.nextInt();//数列の長さ
      int count =0; 
      
      //回数と数列番号を比較
      for(int i =1; i<N; i++){
        int p =sc.nextInt();

          //入れ替えるならカウントする
          if(p!=i){
            	count++;
          }
      }
         //１度だけ入れ替え可能だから(2か所) 
          if(count>2){
            	System.out.println("NO");
          }
      	  else {
            	System.out.println("YES");
          }
    }
}	