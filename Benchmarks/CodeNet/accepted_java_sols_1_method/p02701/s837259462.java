import java.util.Scanner;
import java.util.HashSet;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    HashSet hs = new HashSet();
    for(int i=0; i<N; i++) {
      hs.add(scan.next());
    }
    scan.close();

    System.out.println(hs.size());
  }
}