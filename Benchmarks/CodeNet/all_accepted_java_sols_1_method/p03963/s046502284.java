import java.util.Scanner;

class Main{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int N = Integer.parseInt(scanner.next());
    long K = Long.parseLong(scanner.next());
    scanner.close();

    long ans = K;

    for(int i=1; i<N; i++){
      ans *= K-1l;
    }

    System.out.println(ans);
  }
}
