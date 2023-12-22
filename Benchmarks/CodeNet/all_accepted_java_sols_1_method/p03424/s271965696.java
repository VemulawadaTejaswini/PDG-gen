import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
    String s;
    int arare[] = new int[4];
    int ans = 0;
    
    for (int i = 0; i < n; i++) {
        s = sc.next();
        switch (s) {
            case "P": arare[0] = 1; break;
            case "W": arare[1] = 1; break;
            case "G": arare[2] = 1; break;
            case "Y": arare[3] = 1; break;
        }
    }
    
    for (int i = 0; i < 4; i++)
        ans += arare[i];
    
    System.out.println(ans == 3 ? "Three" : "Four");
  }
}