import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int x = sc.nextInt();
    int t = sc.nextInt();

    int kaisuu = 0;
    int nn = n;
    while(nn > 0) {
      nn = nn - x;
      kaisuu++;
    }
    
    System.out.println(kaisuu*t);
  }
}
