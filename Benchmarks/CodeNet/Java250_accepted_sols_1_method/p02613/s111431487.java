import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
    int[] cnt = new int[4];
    for (int i=0; i<4; i++){
      cnt[i]=0;
    }
    String[] s = new String[n];
    for (int i=0; i<n; i++) {
      s[i] = sc.next();
      switch (s[i]) {
        case "AC":cnt[0]++;break;
        case "WA":cnt[1]++;break;
        case "TLE":cnt[2]++;break;
        case "RE":cnt[3]++;break;
      }
    }
    sc.close();
    System.out.println("AC x " + cnt[0]);
    System.out.println("WA x " + cnt[1]);
    System.out.println("TLE x " + cnt[2]);
    System.out.println("RE x " + cnt[3]);
  }
}