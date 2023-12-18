import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    long startTime = System.currentTimeMillis();
    Scanner stdIn = new Scanner(System.in);
    try {
      long coordinate = stdIn.nextLong();
      long moveNum = stdIn.nextLong();
      long distance = stdIn.nextLong();

      int cnt = 1;
      for (long moveCnt = 1; moveCnt <= moveNum; moveCnt++) {
        long plusNum = coordinate + distance;
        long minusNum = coordinate - distance;
        if (Math.abs(coordinate) < Math.abs(plusNum) && Math.abs(coordinate) < Math.abs(minusNum)) {
          if ((moveNum - moveCnt) % 2 == 0) {
            coordinate = Math.abs(plusNum) > Math.abs(minusNum) ? minusNum : plusNum;
            break;
          } else {
            break;
          }
        }
        coordinate = Math.abs(plusNum) > Math.abs(minusNum) ? minusNum : plusNum;
        if (moveCnt == cnt * 100000000) {
          long endTime = System.currentTimeMillis();
          double resultTime = (double)(endTime - startTime) / 1000;
          System.out.println(cnt + "億回処理時間：" + resultTime + "ミリ秒");
          cnt++;
        }
      }
      System.out.println(Math.abs(coordinate));

    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      stdIn.close();
    }
    long endTime = System.currentTimeMillis();
    double resultTime = (double)(endTime - startTime) / 1000;
    //System.out.println("処理時間：" + resultTime + "ミリ秒");
  }
}