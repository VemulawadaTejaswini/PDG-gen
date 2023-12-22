import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    int n = s.length();
    String[] ss = s.split("");
    for (int i = 0; i < n; i++) {
      if(i%2 == 0 )
        System.out.print(ss[i]);
    }
  }
}