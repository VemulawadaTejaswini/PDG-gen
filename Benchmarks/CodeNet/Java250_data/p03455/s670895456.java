import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();
    StringTokenizer st = new StringTokenizer(str);

    int a = Integer.parseInt(st.nextToken());
    int b = Integer.parseInt(st.nextToken());

    System.out.println(Hoge.isProductPositive(a, b));
  }
}

class Hoge {

  static String isProductPositive(int a, int b) {
    return a * b % 2 == 0 ? "Even" : "Odd";
  }
}