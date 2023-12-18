import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] data = new int[n];

    for(int i = 0;i < n;i++) {
      data[i] = sc.nextInt();
    }

    Arrays.sort(data);

    int x = 0;

    for(int i = 0;i < n-2;i++) {
      for(int k = i + 1;k < n-1;k++) {
        int high = n;
        int low = 0;
        while(high - low > 1) {
          int middle = (high + low) / 2;
          if(data[middle] < data[i] + data[k]) {
            low = middle;
          } else {
            high = middle;
          }
        }
        x += high - k - 1;
      }
    }

    System.out.println(x);

  }

}
