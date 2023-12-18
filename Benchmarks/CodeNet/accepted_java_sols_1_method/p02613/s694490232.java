import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String N_scan = scan.nextLine();
    var N = Integer.parseInt(N_scan);
    String[] S = new String[N];
    int AC  = 0;
    int WA  = 0;
    int TLE = 0;
    int RE  = 0;

    for (var i = 0; i < N; i++) {
      S[i] = scan.nextLine();
    }

    for (var j = 0; j < N; j++) {
      switch (S[j]) {
        case "AC" :
	  AC++;
	  break;
        case "WA" :
	  WA++;
	  break;
        case "TLE" :
	  TLE++;
	  break;
        case "RE" :
	  RE++;
	  break;
      }
    }

    System.out.println("AC x " + AC);
    System.out.println("WA x " + WA);
    System.out.println("TLE x " + TLE);
    System.out.println("RE x " + RE);
    scan.close();
  }
}