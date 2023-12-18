import java.util.Scanner;
import java.util.Arrays;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] v = new int[n];
    for(int i=0; i<n; ++i) v[i] = sc.nextInt();
    Arrays.sort(v);
    double pot = v[0];
    for(int i=1; i<n; ++i) {
      pot = (v[i] + pot)/2;
    }
    System.out.println(pot);
  }
}