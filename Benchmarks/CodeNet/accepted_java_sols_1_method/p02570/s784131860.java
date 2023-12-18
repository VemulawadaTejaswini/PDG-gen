import java.util.*;
import java.io.*;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int distance = Integer.parseInt(scan.next());
    int time = Integer.parseInt(scan.next());
    int speed = Integer.parseInt(scan.next());

    String result;
    if (distance > time * speed) {
      result = "No";
    } else {
      result = "Yes";
    }

    PrintWriter out = new PrintWriter(System.out);
    out.println(result);
    out.flush();
  }
}
