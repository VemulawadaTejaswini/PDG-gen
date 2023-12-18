import java.util.*;

  public class Main {

    public static void main (String[] args) {

      Scanner sc = new Scanner(System.in);

      int N = sc.nextInt();

      int[] a = new int[N+1];
      for (int i = 1; i < N+1; i++) {
        a[i] = sc.nextInt();
      }

      sc.close();

      int[] b = new int[N+1];
  
      for (int i = N; 1 <= i; i--) {
        int count = 0;
        for (int j = i; j <= N; j += i) {
          if (b[j] == 1) {
            count++;
          }
        }
        if (count % 2 == a[i]) {
          b[i] = 0;
        } else {
          b[i] = 1;
        }
      }

      Set<Integer> result = new TreeSet<Integer>();
      for (int i = 1; i < N+1; i++) {
        if (b[i] == 1) {
          result.add(i);
        }
      }

      System.out.println(result.size());

      int count = 0;
      for (Integer value : result) {
        count++;
        System.out.print(value);
        if (count != result.size()) {
          System.out.print(" ");
        } else {
          System.out.println("");
        }
      }

    }

  }