import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
    int[] a = new int[n];
    for(int i=0; i<n; i++){
      a[i] = Integer.parseInt(sc.next());
    }

    long sum = 0;
    
    for(int i = 1; i<n; i++){
      int dif = a[i-1] - a[i];
      if(dif > 0){
        sum += dif;
        a[i] += dif;
      }
    }

    System.out.println(sum);
   
    sc.close();
    return;
  }
  
}
