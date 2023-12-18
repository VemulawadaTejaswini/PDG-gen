import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String taroh;
    String hanako;
    int t = 0;
    int h = 0;
    for(int i = 0; i < n; i++) {
      taroh = sc.next();
      hanako = sc.next();
      if(taroh.compareTo(hanako) > 0) {
        t += 3;
      } else if(taroh.compareTo(hanako) < 0) {
        h += 3;
      } else {
        t++;
        h++;
      }
    }
    System.out.println(t + " " + h);
  }
}

