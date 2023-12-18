import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);

    int[] a = new int[3];
    for(int i = 0; i < 3; i++)
      a[i] = in.nextInt();

    if (a[1] > a[2]) swap(a,1,2);
    if (a[0] > a[1]) swap(a,0,1);
    if (a[1] > a[2]) swap(a,1,2);

    // System.out.printf("%d %d %d",a[0], a[1], a[2]);
    System.out.printf(a[0] +" "+ a[1] + " " + a[2]+"\n");

  }

  static void swap(int[] a, int x1, int x2){
    int t = a[x1]; a[x1] = a[x2]; a[x2] = t;
  }
}