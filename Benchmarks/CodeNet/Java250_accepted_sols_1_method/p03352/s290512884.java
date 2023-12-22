import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    if(x ==1){
      System.out.println(1);
      return;
    }
    int jou;
    int max = -1;
    for(int i = 2;i<=100;i++){
      jou = i;
      int aa = 0;
      while(jou <= x){
        jou *= i;
        aa++;
      }
      if(aa>1){
        jou /= i;
        max = Math.max(max,jou);
      }

    }
    System.out.println(max);
  }
}
