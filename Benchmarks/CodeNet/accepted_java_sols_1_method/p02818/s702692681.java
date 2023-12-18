import java.util.Scanner;
import java.util.Arrays;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long takahashi = sc.nextLong();
    long aoki = sc.nextLong();
    long k = sc.nextLong();
    if(k > takahashi){
      k -= takahashi;
      takahashi = 0L;
      if(k > aoki){
        k-= aoki;
        aoki = 0L;
      }else{
        aoki -= k;
      }
    }else{
      takahashi -= k;
    }
    System.out.println(takahashi + " " + aoki);
  }
}