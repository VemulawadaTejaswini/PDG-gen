/*
非負整数L、Rが与えられます。
２つの整数i,jをL<=i<j<=Rを満たすように選びます。
(i*J)mod2019の最小値を求めてください。
 */


import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    while(sc.hasNext()){
      long L=sc.nextLong();
      long R=sc.nextLong();
      long ans=1000000000;
      if(R-L>=2019){
        System.out.println(0);
      }else{
        for(long i=L;i<R;i++){
          for(long j=i+1;j<=R;j++){
            ans=Math.min(ans,(i*j)%2019);
          }
        }
        System.out.println(ans);
      }
    }
  }
}
