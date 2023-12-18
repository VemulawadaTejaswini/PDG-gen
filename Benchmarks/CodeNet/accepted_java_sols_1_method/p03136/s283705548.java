import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] l = new int[n];
    int sum = 0;

    for(int i = 0; i < n; i++) {
      l[i] = sc.nextInt();
    }
    
    Arrays.sort(l);

    for(int i = n-2; i >= 0; i--) {
      sum += l[i];
    }

    if(l[n-1] < sum) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }

  }

}
