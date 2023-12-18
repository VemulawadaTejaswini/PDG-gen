import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
      
      //入力
      String s = sc.next();//文字列
      int length = s.length();//文字列の長さ
      char [] c = s.toCharArray();//格納
      
      //条件に満たない文字を探す
      for(int i =0; i<length; i++){
        if(i%2!=0){
          if(c[i]=='R'){
            System.out.println("No");
            return;
          }
        }    
        else if(i%2==0){
           if(c[i]=='L'){
            System.out.println("No");
            return;
          }
        }
      }
      System.out.println("Yes");
    }
}