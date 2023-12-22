import java.util.Scanner;

 class Main {
 public static void main(String[] args) {
  Scanner scan = new Scanner(System.in);
  int W, H, x, y, r;

  W = scan.nextInt();
  H = scan.nextInt();
  x = scan.nextInt();
  y = scan.nextInt();
  r = scan.nextInt();

  if (x < -100 || y < -100 || 100 < x || 100 < y || W <= 0 || H <= 0
    || r <= 0 || 100 < W || 100 < H || 100 < r) {
   throw new RuntimeException("error");
  }
  if (0 <= (x - r) && (x + r) <= W && 0 <= (y - r) && (y + r) <= H) {
   System.out.println("Yes");
  } else {
   System.out.println("No");
  }
 }
}