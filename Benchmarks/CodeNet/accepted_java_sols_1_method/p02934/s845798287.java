import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
    int[] a = new int[n];
    double sum = 0;
    for(int i=0; i<n; i++){
      a[i] = Integer.parseInt(sc.next());
      sum += 1.0/a[i];
    }

    sum = 1.0 / sum;
    System.out.println(sum);
  }
}