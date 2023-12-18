import java.util.Scanner;

class Main {
  static int solve(int a, int b, int n) {
    if(n==0) {
      return 0; 
    }
    return ((a * 10) / b + solve(a * 10 % b, b, n - 1));
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    while(sc.hasNext()) {
      String[] arr = sc.nextLine().split(" ");
      int a = Integer.parseInt(arr[0]);
      int b = Integer.parseInt(arr[1]);
      int n = Integer.parseInt(arr[2]);
      System.out.println(solve(a % b, b, n));
    }
  }
}