import java.io.*;
import java.util.*;

public class Main{
  public static void main(String[] args){
    try {
      Scanner sc = new Scanner(System.in);
      int n;
      n=Integer.parseInt(sc.next());
      double[] x = new double[n];
      for(int i=0; i<n; i++){
        x[i]=Double.parseDouble(sc.next());
        String u=sc.next();
        if(u.equals("BTC")){
          x[i]=x[i]*380000;
        }
      }

      double ans=0;
      for(int i=0; i<n; i++){
        ans=ans+x[i];
      }

      System.out.println(ans);
      
      }catch (Exception e) {
      System.out.println("out");
    }
  }
}
