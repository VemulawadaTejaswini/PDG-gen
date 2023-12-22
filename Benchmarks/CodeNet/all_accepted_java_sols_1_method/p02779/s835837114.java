
import java.util.*;
public class Main{
  public static void main(String []args){
  Scanner sc = new Scanner(System.in);

  int n = sc.nextInt();
  int[] data  =new int[n];

  for (int i = 0;i<n ;i++ ) {
    data[i] = sc.nextInt();
  }

  Arrays.sort(data);

  for (int i = 0;i<n-1 ;i++ ) {
    if (data[i]==data[i+1]) {
      System.out.println("NO");
      System.exit(0);
    }
  }
  System.out.println("YES");


}
}
