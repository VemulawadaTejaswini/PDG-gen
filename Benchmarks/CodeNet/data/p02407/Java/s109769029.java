import java.util.Scanner;
import java.util.StringJoiner;

class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    String[] ary = new String[n];

    for (int i = 0; i < n; i++ ) {
      ary[i] = String.valueOf(sc.nextInt());
    }

    sc.close();

    StringJoiner sj = new StringJoiner(" ");

    for(int i = 0; i<n; i++) {
      sj.add(ary[n-1-i]);
    }

    System.out.println(sj.toString());

  }
}