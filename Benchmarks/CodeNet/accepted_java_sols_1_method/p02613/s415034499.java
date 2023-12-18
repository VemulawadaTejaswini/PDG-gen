import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
    int N = sc.nextInt();
    String[] S = new String[N];
    int countAC=0;
    int countWA=0;
    int countTLE=0;
    int countRE=0;
    for (int i =0; i<N; i++) {
      String a = sc.next();
      if (a.equals("AC")) countAC++;
      if (a.equals("WA")) countWA++;
      if (a.equals("TLE")) countTLE++;
      if (a.equals("RE")) countRE++;
    }
    System.out.println("AC x " + countAC);
    System.out.println("WA x " + countWA);
    System.out.println("TLE x " + countTLE);
    System.out.println("RE x " + countRE);
  }
}
