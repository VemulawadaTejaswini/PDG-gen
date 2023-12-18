import java.util.*;
import java.io.*;

class Main {
  public static void main(String args[]) {
    try {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int n = Integer.parseInt(br.readLine());
      String[] line;
      String[] sortedLine;
      int score[] = {0, 0};
      for (int i = 0; i < n; i++) {
        line = br.readLine().split(" ");
        if (line[0].equals(line[1])) {
          score[0] += 1;
          score[1] += 1;
          continue;
        }
        sortedLine = line;
        Arrays.sort(sortedLine);
        if (line.equals(sortedLine)) {
          score[1] += 3;
        } else {
          score[0] += 3;
        }
      }
      System.out.println(score[0] + " " + score[1]);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}