import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long a = sc.nextLong();
    long b = sc.nextLong();
   
    for(int i=0;i<=1000;i++){
      if((int)(i*0.08)==a&&(int)(i*0.1)==b){
        System.out.println(i);
        return;
      }
    }
    System.out.println("-1");
  }
}