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
      return;
    }

    int x = (B-A) % (V-W);
    if(x == 0 && x < T){
        System.out.println("YES");
    }else{
        System.out.println("NO");
    }

    scanner.close();

  }
}