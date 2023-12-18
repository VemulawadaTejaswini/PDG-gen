import java.util.*;
public class Main{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long X = sc.nextLong();
    long K = sc.nextLong();
    long D = sc.nextLong();
    if(X>=0){
      if(X >= K*D){
        System.out.println(X - K*D);
        return;
      }
      long A = X % D;
      long B = X / D;
      if((K-B)%2==0){
        System.out.println(A);
        return;
      }else{
        System.out.println(Math.abs(A-D));
        return;
      }
    }else{
      if((-X) >= K*D){
        System.out.println(-X - K*D);
        return;
      }
      Long A = (-X) % D;
      Long B = (-X) / D;
      if((K-B)%2==0){
        System.out.println(Math.abs(A));
        return;
      }else{
        System.out.println(-A+D);
        return;
      }
    }
  }
}

