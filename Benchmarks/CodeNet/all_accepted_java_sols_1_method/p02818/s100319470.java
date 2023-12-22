import java.util.Arrays;
import java.util.*;
public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    long a = sc.nextLong();
    long b = sc.nextLong();
    long k = sc.nextLong();
    if(k==0){
      System.out.println(a+" "+b);
      System.exit(0);
    }
    if(b<=k-a){
      b = 0;
    }else if(k-a<0){
    }else{
      b = b-(k-a);
    }
    if(a<=k){
      a = 0;
    }else{
      a = a-k;
    }
    System.out.println(a+" "+b);
  }
}
