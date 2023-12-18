import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int cases = sc.nextInt();
    sc.nextLine();
    
    int[] data = new int[4];
    final int AC = 0;
    final int WA = 1;
    final int TLE = 2;
    final int RE = 3;

    for (int i = 0; i < cases; i++) {
      String answer = sc.nextLine();
      switch (answer) {
      case "AC":
        data[AC]++;
        break;
      case "WA":
        data[WA]++;
        break;
      case "TLE":
        data[TLE]++;
        break;
      case "RE":
        data[RE]++;
        break;
      default:
        break;
      }
    }

    System.out.println("AC x "+data[AC]);
    System.out.println("WA x "+data[WA]);
    System.out.println("TLE x "+data[TLE]);
    System.out.println("RE x "+data[RE]);
    
  }
}