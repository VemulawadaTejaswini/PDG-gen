import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    long startTime = System.currentTimeMillis();
    Scanner stdIn = new Scanner(System.in);
    try {
      String weather = new String();
      weather = stdIn.nextLine();
      char[] weatherList = weather.toCharArray();

      int rainDays = 0;
      for (int dayCnt = 0; dayCnt < 3; dayCnt++) {
        int tempRainDays = 0;
        for (int rainCnt = dayCnt; rainCnt < 3; rainCnt++) {
          if (weatherList[rainCnt] == 'R') {
            tempRainDays++;
          } else {
            break;
          }
        }
        if (rainDays < tempRainDays) {
          rainDays = tempRainDays;
        }
      }
      System.out.println(rainDays);
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