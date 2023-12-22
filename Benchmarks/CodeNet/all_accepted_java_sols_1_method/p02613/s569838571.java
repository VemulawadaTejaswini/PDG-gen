import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Arrays;
import java.util.Collections;
import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    String[] judge = new String[n];
    int AC = 0;
    int WA = 0;
    int TLE = 0;
    int RE = 0;
    for (int i = 0;i < n;i++) {
      judge[i] = scan.next();
      if (judge[i].equals("AC")) {
        AC += 1;
      }
      else if (judge[i].equals("WA")) {
        WA += 1;
      }
      else if (judge[i].equals("TLE")) {
        TLE += 1;
      }
      else{
        RE += 1;
      }
    }
    System.out.println("AC x " + AC);
    System.out.println("WA x " + WA);
    System.out.println("TLE x " + TLE);
    System.out.println("RE x " + RE);
  }
}
