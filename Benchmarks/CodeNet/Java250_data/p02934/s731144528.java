import java.util.Scanner;
public class Main {
  public static void main(String... args) {
    Scanner scan = new Scanner(System.in);
    int count = scan.nextInt();
    double sum = 0;
    for (int i=0; i<count&&scan.hasNextInt(); i++) {
      sum += (1/(double)scan.nextInt());
    }
    System.out.println(1/sum);
  }
}