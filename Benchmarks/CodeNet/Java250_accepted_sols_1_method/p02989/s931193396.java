import java.util.*;
import java.math.*;
class Main{
public static void main(String[] args) {
  Scanner stdIn = new Scanner(System.in);
  int n = stdIn.nextInt();
  int[] d = new int[n];
  for(int i = 0;i<d.length;i++) {
    d[i] = stdIn.nextInt();
  }
  Arrays.sort(d);
  if(d.length%2!=0) {
    System.out.println(0);
    System.exit(0);
  }
  int a = d.length/2-1;
  int b = a + 1;
  //System.out.println(a);
  //System.out.println(b);
  int count = 0;
  //System.out.println(d[b]);
  //System.out.println(d[a]);
  count = d[b] - d[a];
  System.out.println(count);
}
}
