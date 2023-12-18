import java.util.*;

class Main {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    String  out = "";
    String[] rs = {"AAA", "AA", "A", "B", "C", "D", "E"};
    while (scanner.hasNext()) {
      double f = scanner.nextDouble();
      double t = scanner.nextDouble();
      int fr = -1;
      int tr = -1;
      if (f < 35.5) {
        fr = 0;
      } else if (f < 37.5) {
        fr = 1;
      } else if (f < 40) {
        fr = 2;
      } else if (f < 43) {
        fr = 3;
      } else if (f < 50) {
        fr = 4;
      } else if (f < 55) {
        fr = 5;
      } else if (f < 70) {
        fr = 6;
      }
      if (t < 60+11) {
        tr = 0;
      } else if (t < 60+17) {
        tr = 1;
      } else if (t < 60+23) {
        tr = 2;
      } else if (t < 60+29) {
        tr = 3;
      } else if (t < 60+45) {
        tr = 4;
      } else if (t < 60+56) {
        tr = 5;
      } else if (t < 60+60+28) {
        tr = 6;
      }
      if (fr < tr) {
        out += rs[tr] + "\n";
      } else {
        out += rs[fr] + "\n";
      }
    }
    System.out.print(out);
  }
}