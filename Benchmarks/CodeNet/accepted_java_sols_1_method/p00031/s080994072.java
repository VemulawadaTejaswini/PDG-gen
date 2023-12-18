import java.util.*;

class Main {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    String out = "";
    String[] ws = {"512", "256", "128", "64", "32", "16", "8", "4", "2", "1"};
    while (scanner.hasNext()) {
      int w10 = scanner.nextInt();
      String work = "000000000" + Integer.toBinaryString(w10);
      work = work.substring(work.length() - 10);
      String temp = "";
      for (int ii = work.length() - 1; ii >= 0; ii--) {
        if (work.charAt(ii) == '0') {
          continue;
        }
        temp += ws[ii] + " ";
      }
      out += temp.trim() + "\n";
    }
    System.out.print(out);
  }
}