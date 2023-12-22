import java.util.*;

class Main {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int h[] = new int[n];
    for (int i = 0; i < n; i++) {
      h[i] = sc.nextInt();
    }
    int max = 0;
    for (int i = 0; i < n; i++) {
      int Rcount = 0;
      int j = i+1;
      while (j < n && h[j] <= h[j-1]) {
        Rcount++;
        j++;
      }
      max = Math.max(max, Rcount);
      //System.out.println(max);
      if (Rcount > 0) i = j - 1;
    }
    System.out.println(max);
  }
}
