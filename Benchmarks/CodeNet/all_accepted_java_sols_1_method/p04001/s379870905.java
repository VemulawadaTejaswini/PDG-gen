import java.util.*;

class Main {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    String n = sc.next();
    long sum = 0;

    for (int i = 0; i < (1<<n.length() - 1); i++) {
      String s = "";
      for (int j = 0; j < n.length(); j++) {
        if ((1 & i >> j) == 1) {
          s += n.charAt(j) + "+";
        }
        else {
          s += n.charAt(j);
        }
      }
      String a[] = s.replaceAll("\\+", " ").split(" ");
      //System.out.println(Arrays.toString(a));
      for (int j = 0; j < a.length; j++) {
        sum += Long.parseLong(a[j]);
      }
    }
    System.out.println(sum);
  }
}
