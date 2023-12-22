import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    try {
      int childrenNum = stdIn.nextInt();
      if (childrenNum < 1 || childrenNum > 100) return;
      int[][] childrenSnack = new int[childrenNum + 1][2];
      int snackNum = stdIn.nextInt();
      if (snackNum < 1 || snackNum > 100) return;
      for (int snackCnt = 0; snackCnt < snackNum; snackCnt++) {
        int havingSnackNum = stdIn.nextInt();
        if (havingSnackNum < 1 || havingSnackNum > childrenNum) return;
        for (int cnt = 0; cnt < havingSnackNum; cnt++) {
          int temphavingChild = stdIn.nextInt();
          childrenSnack[temphavingChild][0] = childrenSnack[temphavingChild][0] + 1;
        }
      }
      int notHavingNum = 0;
      for (int searchCnt = 1; searchCnt <= childrenNum; searchCnt++) {
        if (childrenSnack[searchCnt][0] == 0) notHavingNum++;
      }
      System.out.println(notHavingNum);
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      stdIn.close();
    }
  }
}