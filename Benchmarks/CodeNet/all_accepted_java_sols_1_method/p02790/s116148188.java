import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
      
      //整数入力
      int a = sc.nextInt();
      int b = sc.nextInt();
      
      //数字の小さい方を出力
      if(a<=b){
       for(int i =0; i<b; i++){
        System.out.print(a);
       }
      }
      if(b<a) {
       for(int i =0; i<a; i++){
         System.out.print(b);
       }
      }
    }
}