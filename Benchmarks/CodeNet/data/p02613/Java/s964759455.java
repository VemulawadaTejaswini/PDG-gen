import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    HashMap<String, Integer> mp = new HashMap<>();
    for(int i = 0; i < n; i++) {
      String curr = in.next().trim();
      mp.put(curr, mp.getOrDefault(curr, 0) + 1);
    }
    
    System.out.println("AC x " + mp.get("AC"));
    System.out.println("WA x " + mp.get("WA"));
    System.out.println("TLE x " + mp.get("TLE"));
    System.out.println("RE x " + mp.get("RE"));
  }
}