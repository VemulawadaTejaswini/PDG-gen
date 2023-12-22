import java.util.Scanner;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int acN = 0;
    int waN = 0;
    int tleN = 0;
    int reN = 0;
    int n = sc.nextInt();
    for (int cnt = 0; cnt < n; cnt++) {
      String s = sc.next();
      switch (s) {
        case "AC":
          acN++;
          break;
        case "WA":
          waN++;
          break;
        case "TLE":
          tleN++;
          break;
        case "RE":
          reN++;
          break;
      }
    }
    System.out.println("AC x " + acN);
    System.out.println("WA x " + waN);
    System.out.println("TLE x " + tleN);
    System.out.println("RE x " + reN);
    sc.close();
  }
}