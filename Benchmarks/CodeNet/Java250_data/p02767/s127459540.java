import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int A = 0;
    int[] xx = new int[n];
    for (int i = 0; i < n; i++) {
      int x = sc.nextInt();
      xx[i] = x;
      A += x;
    }
    int p = A/n;
    int p1 = p+1;
    int B = 0;
    int B1 = 0;
    for (int i = 0; i < n; i++){
      B += Math.pow((xx[i]-p), 2);
      B1 += Math.pow((xx[i]-p1), 2);
    }
    System.out.println(Math.min(B, B1));
  }
}