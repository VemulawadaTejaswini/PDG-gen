import java.util.*;

public class Main{
  public static void main(String[] args) {
    try {
      Scanner scn = new Scanner(System.in);

      int n = Integer.parseInt(scn.next());
      int i, a[] = new int[n], alice=0, bob=0;

      for(i=0; i<n; i++){
        a[i] = Integer.parseInt(scn.next());
      }

      Arrays.sort(a);

      for(i=n-1; i>=0; i=i-2){
        alice = alice+a[i];
      }
      for(i=n-2; i>=0; i=i-2){
        bob = bob+a[i];
      }

      System.out.println(alice-bob);
    }
    catch (Exception e) {
      
    }
  }
}