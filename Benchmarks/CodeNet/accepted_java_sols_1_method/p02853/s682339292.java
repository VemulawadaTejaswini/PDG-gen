import java.util.*;
public class Main{
  public static void main(String[]args){
      Scanner sc = new Scanner(System.in);

      int x = sc.nextInt();
      int y = sc.nextInt();
      int sum = 0;

      if(x==1){
        sum = sum + 300000;
      }
      if(x==2){
        sum = sum + 200000;
      }
      if(x==3){
        sum = sum + 100000;
      }
      if(y==1){
        sum = sum + 300000;
      }
      if(y==2){
        sum = sum + 200000;
      }
      if(y==3){
        sum = sum + 100000;
      }
      if(x==1&&y==1){
        sum = sum + 400000;
      }
      System.out.println(sum);
  }
}
