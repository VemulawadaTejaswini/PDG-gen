import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String str = scan.nextLine();
    int n = Integer.parseInt(str);
    str = scan.nextLine();
    boolean[] bool = new boolean[n];
    for (int i = 0; i < n; i++) {
      bool[i] = str.charAt(i) == '1';
    }
    for (int i = 0; i < n; i++) {
      // Xiを求める
      StringBuilder sb = new StringBuilder();
      for (int j = 0; j < n; j++) {
        sb.append(bool[j]^i==j? '1' : '0');
      }
      long current = Long.parseLong(sb.toString(), 2);
      int count = 0;
      while (current != 0){
        count++;
        final int popcount = popcount(current);
        if (popcount == 0) break;
        current %= popcount;
      }
      System.out.println(count);
    }
  }
  private static int popcount(long number){
    final String bin = Long.toBinaryString(number);
    int count = 0;
    for (int i = 0; i < bin.length(); i++) {
      if (bin.charAt(i) == '1') {
        count++;
      }
    }
    return count;
  }
}
