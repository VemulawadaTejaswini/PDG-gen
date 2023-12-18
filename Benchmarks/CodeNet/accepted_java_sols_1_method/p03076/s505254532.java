import java.util.*;

class Main{
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int min_n = -1, min_i = -1, sum = 0;
    int a[] = new int[5];
    for (int i = 0; i < 5; i++) {
      a[i] = sc.nextInt();
      if (i == 0 || a[i] % 10 < min_n && a[i] % 10 != 0) {
        min_n = a[i] % 10;
        min_i = i;
      }
    }
    for (int i = 0; i < 5; i++) {
      if (i == min_i) {
        sum += a[i];
      }
      else if (a[i] % 10 != 0){
        sum += a[i] + (10 - (a[i]%10));
      }
      else {
        sum += a[i];
      }
    }
    System.out.println(sum);
  }
}
