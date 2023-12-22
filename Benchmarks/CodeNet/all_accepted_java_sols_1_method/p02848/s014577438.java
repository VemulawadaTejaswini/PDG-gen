import java.util.*;

class Main {
  public static void main(String... args) {
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    String S = scan.next();
    scan.close();
        
    int tmp = 0;
    StringBuilder res = new StringBuilder();
    for(int i=0; i<S.length(); i++) {
      tmp = (int)S.charAt(i)+N;
      tmp = tmp > 90 ? tmp-26 : tmp;
      res.append((char)tmp);
    }
    System.out.println(res.toString());
  }
}