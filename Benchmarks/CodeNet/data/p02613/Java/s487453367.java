import java.util.Scanner;
class Rp11_173B {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    String[] s = new String[n];
    for(int i = 0; i < n; i++) {
      s[i] = sc.next();
    }

    int[] count = new int[4];

    for(int i = 0; i < n; i++) {
      if(s[i] == "AC") count[0]++;
      else if(s[i] == "WA") count[1]++;
      else if(s[i] == "TLE") count[2]++;
      else if(s[i] == "RE") count[3]++;
    }

    System.out.println("AC x " + count[0]);
    System.out.println("WA x " + count[1]);
    System.out.println("TLE x " + count[2]);
    System.out.println("RE x " + count[3]);
  }
}