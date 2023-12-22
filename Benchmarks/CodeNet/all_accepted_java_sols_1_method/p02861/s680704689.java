import java.util.*;
import static java.lang.Math.sqrt;
public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int x[] = new int[n];
    int y[] = new int[n];
    double total = 0;
    for(int i=0 ; i<n ; i++){
      x[i] = sc.nextInt();
      y[i] = sc.nextInt();
    }
    for(int i=0 ; i<n-1 ; i++){
      for (int j=i+1 ; j<n ; j++) {
        total = total + sqrt(((x[i]-x[j])*(x[i]-x[j]))+((y[i]-y[j])*(y[i]-y[j])));
      }
    }
    System.out.println(total*2/n);
  }
}
