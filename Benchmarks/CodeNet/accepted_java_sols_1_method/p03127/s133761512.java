import java.io.*;
import java.util.*;

public class Main{
  public static void main(String[] args){
    try {
      Scanner sc = new Scanner(System.in);
      int n;

      n = Integer.parseInt(sc.next());

      int a[] = new int[n];

      for(int i=0; i<n; i++){
        a[i] = Integer.parseInt(sc.next());
      }

      Arrays.sort(a);
      int min = a[0];

      while(true){
        for(int j=1; j<n; j++){
          if(a[j]%min == 0){
            a[j] = min;
          }else{
            a[j] = a[j]%min;
          }
        }
        Arrays.sort(a);
        if(min == a[0]){
          break;
        }else{
          min = a[0];
        }
      }
            
      System.out.println(min);
    }
    catch (Exception e) {
      System.out.println("out");
    }
  }
}
