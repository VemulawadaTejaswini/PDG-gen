import java.util.*;
public class Main{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int a,b,i,c,d;
    while(sc.hasNext()){
      a = sc.nextInt();
      b = sc.nextInt();
      d = 1;
      for(i = 1;i <= Math.min(a,b);i++){
        if(a % i == 0 && b % i == 0)d = i;
      }
      c = a / d * b ;
      System.out.println(d + " " + c);
    }
  }
}