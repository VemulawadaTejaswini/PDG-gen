import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
    for(int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }

    int sum = 0;
    int max = a[0];
    for(int i = 1; i < n; i++) {
      if(max > a[i]) {
        sum = sum + (max-a[i]);
      }else{
        max = a[i];
      }
    }

    System.out.println(sum);
  }
}
