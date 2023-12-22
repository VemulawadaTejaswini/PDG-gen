import java.util.ArrayList;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double n = sc.nextInt();
    double sum = 0;
    ArrayList<Integer> b = new ArrayList<Integer>();
    for (int i = 0; i < n; i++) {
      int c = sc.nextInt();
      sum += c;
      b.add(c);
    }
    double avg = Math.round(sum / n);
    int r = 0;
    for (int i = 0; i < n; i++) {
      r += Math.pow((b.get(i) - avg), 2);
    }
    System.out.println(r);
    sc.close();
  }
}
