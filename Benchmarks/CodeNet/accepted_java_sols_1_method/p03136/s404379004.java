import java.util.*;
 
public class Main {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] l = new int[n];
      int sum = 0;
      for (int i = 0; i < n; i++) {
        l[i] = sc.nextInt();
        sum+=l[i];
      }
      Arrays.sort(l);
      int max = l[l.length - 1];
      sum -= max;
      if (max < sum) {
        System.out.println("Yes");
        System.exit(0);
      }
      System.out.println("No");
    }
  }