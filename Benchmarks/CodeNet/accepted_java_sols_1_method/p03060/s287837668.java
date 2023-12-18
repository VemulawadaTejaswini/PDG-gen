import java.util.*;
import java.math.*;

class Main {
  public static void main(String[] args){
  Scanner stdIn = new Scanner(System.in);
  int n = stdIn.nextInt();
  int[] v = new int[n];
  int[] c = new int[n];
  int count = 0;
  for(int i = 0;i<n;i++) {
    v[i] = stdIn.nextInt();
  }
  for(int i = 0;i<n;i++) {
    c[i] = stdIn.nextInt();
  }
  for(int i = 0;i<n;i++) {
    int k = v[i] - c[i];
    if(k>0) count += k;
  }
  System.out.println(count);
}
}