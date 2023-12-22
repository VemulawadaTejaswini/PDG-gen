import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int X = sc.nextInt();
    int Y = sc.nextInt();
    int judge = 0;
    
    while(X>=0&&Y>=0){
      if(Y/4==X&&Y%4==0){
        judge = 1;
        break;
      }
      X = X-1;
      Y = Y-2;
    }
    if(judge==1){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}