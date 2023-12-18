import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int k = sc.nextInt();

    int count = k;
    String YorN = "No";
    while(a >= b && count > 0) {
      b = b*2;
      count--;
    }
    while(b >= c & count > 0) {
      c = c*2;
      count--;
    }
    if(a < b && b < c) YorN = "Yes";
    System.out.println(YorN);
  }
}