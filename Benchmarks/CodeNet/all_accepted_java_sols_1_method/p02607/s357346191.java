import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int a[] = new int[n+1];
    for(int i = 1; i <= n; i++) {
      a[i] = sc.nextInt();
    }

    int count = 0;
    for(int i = 1; i <= n; i++) {
      if(i%2 == 1 && a[i]%2 == 1) count++;
    }

    System.out.println(count);
  }
}
