import java.io.*;
import java.util.*;

public class Main{
  public static void main(String[] args){
    try {
      Scanner sc = new Scanner(System.in);
      int n, ans=0;
      n=Integer.parseInt(sc.next());
      int[] p = new int[n];
      for(int i=0; i<n; i++){
        p[i]=Integer.parseInt(sc.next());
      }

      
      Arrays.sort(p);
      for(int i=0; i<n-1; i++){
        ans=ans+p[i];
      }
      System.out.println(ans+(p[n-1]/2));
      
      }catch (Exception e) {
      System.out.println("out");
    }
  }
}
