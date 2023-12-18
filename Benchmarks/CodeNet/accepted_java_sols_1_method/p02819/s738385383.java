import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long x = sc.nextLong();
    if(x==2){
      System.out.println(2);
      return;
    }
    for(long i=x;i<x*5;i++){
      boolean flag = true;
      for(int j=2;j<=Math.sqrt(i);j++){
        if(i%j==0)flag=false;
      }
      if(flag){
        System.out.println(i);
        return;
      }
    }
  }
}
