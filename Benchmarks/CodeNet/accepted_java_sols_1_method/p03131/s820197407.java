import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long k = sc.nextLong();
    long a = sc.nextLong();
    long b = sc.nextLong();
    long cnt = 1;
    if(b-a<=2){
      System.out.println(cnt+k);
      return;
    }
    while(k>0&&cnt<a){
      k--;
      cnt++;
    }
    if(k%2==1){
      cnt++;
      k--;
    }
    if(k==0){
      System.out.println(cnt);
      return;
    }
    while(k>0){
      cnt += b-a;
      k-=2;
    }
    System.out.println(cnt);
  }
}