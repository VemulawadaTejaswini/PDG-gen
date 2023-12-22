import java.io.*;
import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.next());
    String[] s = new String[N];
    
    char[] chars = new char[10];
    StringBuilder sb;
    for (int i = 0; i < N; i++) {
      sc.next().getChars(0, 10, chars, 0);
      Arrays.sort(chars);
      sb = new StringBuilder();
      for (int j = 0; j < 10; j++) {
        sb.append(chars[j]);
      }
      s[i] = sb.toString();
    }
    Arrays.sort(s);
    
    long count = 1;
    long sum = 0;
    for (int i = 1; i < N; i++) {
      if (s[i].equals(s[i-1])) {
        count++;
        if (i == N-1) {
          sum += count * (count - 1);
        }
      } else {
        if (count == 1) {
          continue;
        } else {
          sum += count * (count - 1);
          count = 1;
        }
      }
    }
    
    System.out.println(sum / 2);
  }
}