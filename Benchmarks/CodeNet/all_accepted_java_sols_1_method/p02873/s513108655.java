import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String input = scan.next();

    int gc = 0; // '<'
    int lc = 0; // '>'
    long sum = 0;
    int pc = 0;
    for (int i = 0; i < input.length(); i++) {
      if (input.charAt(i) == '<') {
        gc++;
        sum+=gc;
        lc = 0;
      } else {
        if (gc != 0) {
          pc = gc;
          gc = 0;
        }
        if (pc <= lc) {
            sum++;
        }
        sum += lc;
        lc++;
      }
    }
    System.out.println(sum);
  }
}
