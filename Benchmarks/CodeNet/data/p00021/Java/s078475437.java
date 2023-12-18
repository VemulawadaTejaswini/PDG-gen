import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws NumberFormatException, IOException {
    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

    final int datasetCount = Integer.valueOf(input.readLine());
    while (input.ready()) {
      final String[] datasetStr = input.readLine().split(" ");
      float[] lineAB = new float[datasetStr.length / 2];
      float[] lineCD = new float[datasetStr.length / 2];
      for (int i = 0; i < 4; i++) {
        lineAB[i] = Float.parseFloat(datasetStr[i]);
      }
      for (int i = 0; i < 4; i++) {
        lineCD[i] = Float.parseFloat(datasetStr[i + 4]);
      }

      System.out.println(isParallelStr(lineAB, lineCD));
    }
  }

  private static String isParallelStr(float[] lineAB, float[] lineCD) {
    if (isParallel(lineAB, lineCD)) {
      return "YES";
    }
    return "NO";
  }

  private static boolean isParallel(float[] lineAB, float[] lineCD) {
    final double slopeLineAB = getSlope(lineAB[0], lineAB[1], lineAB[2], lineAB[3]);
    final double slopeLineCD = getSlope(lineCD[0], lineCD[1], lineCD[2], lineCD[3]);
    return slopeLineAB == slopeLineCD;
  }

  private static double getSlope(float x1, float y1, float x2, float y2) {
    final double diff_X = x2 - x1;
    final double diff_Y = y2 - y1;
    if (diff_X == 0L) {
      return Double.MAX_VALUE;
    }
    final double slope = diff_Y / diff_X;
    return slope;
  }
}