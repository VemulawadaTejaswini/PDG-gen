import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    int A = scanner.nextInt();
    int V = scanner.nextInt();
    int B = scanner.nextInt();
    int W = scanner.nextInt();
    int T = scanner.nextInt();

    if(V-W <= 0){
      System.out.println("NO");
      scanner.close();
      return;
    }

    float x = Math.abs((float)(B-A)) / (float)(V-W);
    int y = (B-A) % (V-W);
    if(x > T){
        System.out.println("NO");
    }else{
        System.out.println("YES");
    }

    scanner.close();

  }
}