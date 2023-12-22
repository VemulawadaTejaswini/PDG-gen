
import java.util.*;
public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int[] data = new int[n];
    int[] data2 = new int[n];
    int min=100;

    for (int i = 0;i<n ;i++ ) {
      data[i] = sc.nextInt();
    }
    data2[0]=data[0];
    for (int t = 1;t<n ;t++ ) {
      data2[t] = data2[t-1]+data[t];
      }

      for (int i = 0;i<n ;i++ ) {
        int t1 = data2[n-1]-data2[i];
        int t0 = data2[i];
        int pre = Math.abs(t1-t0);
        min = Math.min(min,pre);
      }
      System.out.println(min);
    }

  }
