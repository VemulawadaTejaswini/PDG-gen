import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] head = br.readLine().split(" ");
    int h = Integer.parseInt(head[0]);
    int w = Integer.parseInt(head[1]);
    int m = Integer.parseInt(head[2]);
    int[] cntH = new int[h];
    int[] cntW = new int[w];
    Arrays.fill(cntH, 0);
    Arrays.fill(cntW, 0);
    Target[] targets = new Target[m];
    for (int i = 0; i < m; i++) {
      String[] data = br.readLine().split(" ");
      int posH = Integer.parseInt(data[0]) - 1;
      int posW = Integer.parseInt(data[1]) - 1;
      cntH[posH]++;
      cntW[posW]++;
      targets[i] = new Target(posH, posW);
    }
    br.close();
    int maxCntH = Arrays.stream(cntH).max().getAsInt();
    long maxLinesH = Arrays.stream(cntH).filter(i -> i == maxCntH).count();
    int maxCntW = Arrays.stream(cntW).max().getAsInt();
    long maxLinesW = Arrays.stream(cntW).filter(i -> i == maxCntW).count();

    long intersection = maxLinesH * maxLinesW;
    for (Target target : targets) {
      if (cntH[target.posH] == maxCntH && cntW[target.posW] == maxCntW) {
        intersection--;
      }
    }
    System.out.println(intersection > 0 ? maxCntH + maxCntW : maxCntH + maxCntW - 1);
  }
}

class Target {

  int posH, posW;

  Target(int posH, int posW) {
    this.posH = posH;
    this.posW = posW;
  }
}
