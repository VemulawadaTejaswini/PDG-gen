import java.io.*;
import java.util.*;

public class Main{
  public static void main(String[] args){
    try {
      Scanner sc = new Scanner(System.in);
      int n;
      double t, a;
      n=Integer.parseInt(sc.next());
      t=Integer.parseInt(sc.next());
      a=Integer.parseInt(sc.next());
      double[] h = new double[n];
      for(int i=0; i<n; i++){
        h[i]=t-Integer.parseInt(sc.next())*0.006;
      }

      int ans=0;
      for(int i=1; i<n; i++){
        if(Math.abs(a-h[i])<Math.abs(a-h[ans])){
          ans=i;
        }
      }

      System.out.println(ans+1);
      
      }catch (Exception e) {
      System.out.println("out");
    }
  }
}
