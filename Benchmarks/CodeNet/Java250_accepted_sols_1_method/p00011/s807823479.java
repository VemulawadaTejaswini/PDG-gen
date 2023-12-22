import java.util.Scanner;

public class Main{
  public static void main (String[] args) {
    Scanner sc =new Scanner(System.in);
    int w = sc.nextInt();
    int n = sc.nextInt();
    int[] a = new int[w];
    for(int i=0;i<w;i++){
      a[i]=i+1;
    }
    for(int i=0;i<n;i++){
      String line = sc.next();
      String[] ml =line.split(",");
      int m = Integer.parseInt(ml[0]) -1;
      int l = Integer.parseInt(ml[1]) -1;
      int k = a[m];
      a[m] = a[l];
      a[l] = k;
    }
    for(int i=0;i<w;i++)
      System.out.println(a[i]);
      sc.close();
  }
}
