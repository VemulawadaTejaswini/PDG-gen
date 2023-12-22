import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long h = sc.nextLong();
    long w = sc.nextLong();
    if(h==1l||w==1l){
      System.out.println(1);
      return;
    }
    long we= w/2,wo=w/2,ans=0l;
    if(w%2==1l){
      wo++;
    }
    ans = (we+wo)*(h/2l);
    if(h%2==1l){
      ans+=wo;
    }
    System.out.println(ans);

  }
}
