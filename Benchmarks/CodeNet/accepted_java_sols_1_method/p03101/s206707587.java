import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int H = sc.nextInt();
    int W = sc.nextInt();
    int h = sc.nextInt();
    int w = sc.nextInt();

    int total = H * W;
    int b = W * h + (H - h) * w;

    System.out.println(total - b);

  }

}
