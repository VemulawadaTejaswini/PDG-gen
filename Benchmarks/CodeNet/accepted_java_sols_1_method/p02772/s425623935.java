import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int iNum = sc.nextInt();
    sc.nextLine();
    String sValue = sc.nextLine();
    String[] sSplitStr = sValue.split(" ");
    String sResult;
    int iCnt1 = 0;
    int iCnt2 = 0;
    for (int i = 0; i < iNum; i++) {
      int iOut = Integer.parseInt(sSplitStr[i]);
      if (0 != (iOut % 2)) {
        continue;
      }
      iCnt1++;
      if (0 == (iOut % 3) || (0 == (iOut % 5))) {
        iCnt2++;
      }
    }
    if (iCnt1 == iCnt2) {
      sResult = "APPROVED";
    } else {
      sResult = "DENIED";
    }
    System.out.print(sResult);
  }
}
