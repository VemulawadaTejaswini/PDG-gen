import java.util.*;

class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int g = sc.nextInt();
    int a[] = new int[n];
    int count = 0;
    int sum = 0;
    for(int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
      sum += a[i];
      count++;
    }
    Arrays.sort(a);
    System.out.println(count + ((g - sum) / a[0]));
  }
}
