import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
      int n= sc.nextInt();
      boolean judge = false;
      for(int i=0; i<=25; i++){
        for(int j=0; j<=14; j++){
          int sum = 4*i + 7*j;
          if(sum == n){
            judge = true;
          }
        }
      }
      if(judge){
        System.out.println("Yes");
      }else{
        System.out.println("No");
      }
  }
}