import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    long X =sc.nextLong();
    if(X<0){X=-X;}
    long K =sc.nextLong();
    long D =sc.nextLong();
    long w =X/D;
    long ans;
    if(w>K){ans=X-K*D;}
    else{
      long z = X-w*D;
      long p =K-w;
      if(p%2==0){ans =z;}
      else{ans =z-D;}
    }
    ans =Math.abs(ans);
    System.out.println(ans);
  }
}