import java.util.*;
public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int l[] = new int[n];
    int count = 0;

    for (int i = 0;i<n ;i++ ) {
      l[i] = sc.nextInt();
    }

    Arrays.sort(l);

    for (int i = 0;i<n-2 ;i++ ) {
      for (int j = i+1;j<n-1 ;j++ ) {
        for (int t = j+1;t<n ;t++ ) {
          if (l[i]!=l[j]&&l[i]!=l[t]&&l[j]!=l[t]) {
              if (l[t]<l[i]+l[j]) {
                count++;
              }
          }
        }
      }
    }

    System.out.println(count);
  }
}
