import java.util.Scanner;
class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    String[] s = new String[n];
    for(int i = 0; i < n; i++) {
      s[i] = sc.next();
    }

    int[] count = new int[4];

    for(int i = 0; i < n; i++) {
      switch(s[i]) {
        case "AC": count[0]++; break;
        case "WA": count[1]++; break;
        case "TLE": count[2]++; break;
        case "RE": count[3]++; break;
      }
    }

    System.out.println("AC x " + count[0]);
    System.out.println("WA x " + count[1]);
    System.out.println("TLE x " + count[2]);
    System.out.println("RE x " + count[3]);
  }
}
