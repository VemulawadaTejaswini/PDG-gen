
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.nextLine();

    int acCnt = 0;
    int waCnt = 0;
    int tleCnt = 0;
    int reCnt = 0;

    for(int i = 0;i<n;i++) {
      switch(sc.nextLine()) {
        case "AC":
          acCnt++;
          break;
        case "WA":
          waCnt++;
          break;
        case "TLE":
          tleCnt++;
          break;
        case "RE":
          reCnt++;
          break;
      }
    }
    sc.close();

    System.out.println("AC x  " + acCnt);
    System.out.println("WA x  " + waCnt);
    System.out.println("TLE x  " + tleCnt);
    System.out.println("RE x  " + reCnt);

  }

}
