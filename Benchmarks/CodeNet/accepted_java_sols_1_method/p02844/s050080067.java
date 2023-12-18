import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    String s = sc.next();
    String[] str = new String[1000];
    int cnt = 0;

    for (int i = 0; i < 10; i++) {
      str[i] = "00" + i;
    }

    for (int i = 10; i < 100; i++) {
      str[i] = "0" + i;
    }

    for (int i = 100; i < 1000; i++) {
      str[i] = "" + i;
    }

    for (int i = 0; i < 1000; i++) {
      int j = 0;
      while ((j < n) && (s.charAt(j) != str[i].charAt(0))) {
        j++;
      }
      j++;
      while ((j < n) && (s.charAt(j) != str[i].charAt(1))) {
        j++;
      }
      j++;
      while ((j < n) && (s.charAt(j) != str[i].charAt(2))) {
        j++;
      }
      if (j < n) {
        cnt++;
      }

    }
    
    System.out.println(cnt);

  }

}