//以下のような、たてH cm よこ W cm のチェック柄の長方形を描くプログラムを作成して下さい。
import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    for(int i=0;;i++){
      int H = sc.nextInt();
      int W = sc.nextInt();
      int a = W/2;
      int b = W%2;
      if(H == 0 && W == 0) break;
      for(int j=0;j<H;j++){
        if(j%2==0){
          for(int k=0;k<a;k++){
            System.out.printf("#.");
          }
          if(b==1){
            System.out.printf("#\n");
          }else{
            System.out.printf("\n");
          }
        }else{
          for(int k=0;k<a;k++){
            System.out.printf(".#");
          }
          if(b==1){
            System.out.printf(".\n");
          }else{
            System.out.printf("\n");
          }
        }
      }
      System.out.printf("\n");
    }
  }
}

