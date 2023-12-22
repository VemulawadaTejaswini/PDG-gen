import java.util.*;

public class Main{

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int n = Integer.parseInt(sc.next());

    int[] a = new int[n];
    for (int i=0; i<n; i++){
      a[i] = Integer.parseInt(sc.next());
    }

    for (int i=0; i<n; i++){
      if (a[i] % 2 == 0){
        if (a[i] % 3 != 0 && a[i] % 5 != 0){
          System.out.println("DENIED");
          break;
        }
      }
      if (i == n-1)
        System.out.println("APPROVED");
    }
    
  }
}
