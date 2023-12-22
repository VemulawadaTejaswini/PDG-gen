import java.util.*;//ABC121_A
public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int H = sc.nextInt();
    int W = sc.nextInt();
    int h = sc.nextInt();
    int w = sc.nextInt();

    int A = H*W;
    int B = (h*W)+(w*H)-(h*w);
    System.out.println(A-B);
  }
}
