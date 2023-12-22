import java.util.Scanner;
  public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int K = sc.nextInt();
      String S = sc.next();
      if(S.length()<=K) {
        System.out.println(S);
      } else if(S.length()>K) {
        String T = S.substring(0,K);
        System.out.println(T + "...");
      }
    }
  }