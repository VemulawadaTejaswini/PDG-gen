import java.util.Scanner;

public class Main{

  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int w = sc.nextInt();
      int[] a = new int[w+1];
      for(int i = 1; i < w+1; i++) a[i]=i;
      int n = sc.nextInt();
      for(int i = 0; i < n; i++){
          String[] s = sc.next().split(",");
          int l = Integer.parseInt(s[0]);
          int r = Integer.parseInt(s[1]);
          int exchange = a[l];
          a[l] = a[r];
          a[r] = exchange;
      }
      for(int i = 1; i < w+1; i++)System.out.println(a[i]);
  }
}