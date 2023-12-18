import java.util.Scanner;
public class Main {

  public static void myPrint(String[] ary, int a, int b) {
    StringBuilder s = new StringBuilder();
    for (int i = a; i <= b; i++) {
      s.append(ary[i]);
    }
    System.out.println(s);
  }

  public static void myReverse(String[] ary, int a, int b) {
    while (a < b) {
      String temp = ary[a];
      ary[a] = ary[b];
      ary[b] = temp;
      a++;
      b--;
    }
  }

  public static void myReplace(String[] ary, int a, int b, String p) {
    String[] pAry = p.split("");
    int j = 0;
    for (int i = a; i <= b; i++) {
      ary[i] = pAry[j];
      j++;
    }
  }

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String str = s.nextLine();
    String[] strAry = str.split("");
    int n = s.nextInt();
    int a;
    int b;
    String p;
    for (int i = 0; i < n; i++) {
      String cmd = s.next();
      switch(cmd) {
        case "print":
          a = s.nextInt();
          b = s.nextInt();
          myPrint(strAry, a, b);
          break;
        case "reverse":
          a = s.nextInt();
          b = s.nextInt();
          myReverse(strAry, a, b);
          break;
        case "replace":
          a = s.nextInt();
          b = s.nextInt();
          p = s.next();
          myReplace(strAry, a, b, p);
          break;
      }
    }
    s.close();
  }
}

