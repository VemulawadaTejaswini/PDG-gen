import java.io.*;
import java.util.*;
public class Main {
  public static void main(String[] args) throws Exception {
    String line = null;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    line = br.readLine();
    long len = line.length();
    long aCount[] = new long[26];
    long rev = 0;
    long answer = 1;
    // 各アルファベットの出現回数をカウント
    for (char chr: line.toCharArray()) {
      aCount[(chr - 'a')]++;
    }
    // 各アルファベットのペアの総数をカウント
    for (int i = 0; i < 26; i++) {
      long data = aCount[i];
      if (data > 1) {
        rev = rev + data * (data - 1) / 2;
      }
    }
    if (len > 1) {
      answer = answer + len * (len - 1) / 2;
    }
    System.out.println(answer - rev);
  }
}