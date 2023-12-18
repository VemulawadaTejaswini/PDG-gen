import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String n = sc.next();
    sc.close();
    int mod = 9;
    int ans = 0;
    for(int i = 0; i < n.length(); i++){
      ans = ans + (n.charAt(i) - '0');
      ans = ans % mod;
    }
    System.out.println(ans == 0 ? "Yes" : "No");
  }
}