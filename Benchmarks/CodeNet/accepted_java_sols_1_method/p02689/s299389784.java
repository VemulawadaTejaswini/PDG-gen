import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    try {
      int observatoryNum = stdIn.nextInt();
      if (observatoryNum < 2 || observatoryNum > (int)Math.pow(10, 5)) return;
      //int[][] roadList = new int[observatoryNum][observatoryNum];
      int[][] resultList = new int[observatoryNum][2];
      int roadNum = stdIn.nextInt();
      if (roadNum < 1 || roadNum > Math.pow(10, 5)) return;
      int[] hight = new int[observatoryNum];
      for (int hightCnt = 0; hightCnt < observatoryNum; hightCnt++) {
        hight[hightCnt] = stdIn.nextInt();
        if (hight[hightCnt] < 1 || hight[hightCnt] > Math.pow(10, 9)) return;
      }
      for (int roadCnt = 0; roadCnt < roadNum; roadCnt++) {
        int startPosition = stdIn.nextInt() - 1;
        int endPosition = stdIn.nextInt() - 1;
        if (startPosition == endPosition) return;
        resultList[startPosition][0]++;
        resultList[endPosition][0]++;
        if (hight[startPosition] > hight[endPosition]) resultList[startPosition][1]++;
        if (hight[endPosition] > hight[startPosition]) resultList[endPosition][1]++;
      }
      int highestNum = 0;
      for (int result[] : resultList) {
        if (result[0] == result[1]) highestNum++;
      }
      System.out.println(highestNum);
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      stdIn.close();
    }
  }
}