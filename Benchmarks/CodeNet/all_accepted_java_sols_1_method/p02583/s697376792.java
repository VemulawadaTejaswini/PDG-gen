import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    long startTime = System.currentTimeMillis();
    Scanner stdIn = new Scanner(System.in);
    try {
      int sideNum = stdIn.nextInt();
      int[] sideArray = new int[sideNum];
      for (int sideCnt = 0; sideCnt < sideNum; sideCnt++) {
        sideArray[sideCnt] = stdIn.nextInt();
      }

      int triagleNum = 0;
      for (int side1Cnt = 0; side1Cnt < sideNum; side1Cnt++) {
        for (int side2Cnt = side1Cnt; side2Cnt < sideNum; side2Cnt++) {
          for (int side3Cnt = side2Cnt; side3Cnt < sideNum; side3Cnt++) {
            if (side1Cnt != side2Cnt && side2Cnt != side3Cnt && side1Cnt != side3Cnt) {
              if ((sideArray[side1Cnt] + sideArray[side2Cnt]) > sideArray[side3Cnt]
                  && (sideArray[side2Cnt] + sideArray[side3Cnt]) > sideArray[side1Cnt]
                      && (sideArray[side3Cnt] + sideArray[side1Cnt]) > sideArray[side2Cnt]) {
                if (sideArray[side1Cnt] != sideArray[side2Cnt]
                    && sideArray[side2Cnt] != sideArray[side3Cnt]
                      && sideArray[side1Cnt] != sideArray[side3Cnt]) {
                  triagleNum++;
                }
              }
            }
          }
        }
      }
      System.out.println(triagleNum);
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