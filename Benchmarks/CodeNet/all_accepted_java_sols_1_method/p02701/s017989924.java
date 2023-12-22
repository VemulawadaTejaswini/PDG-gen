import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Set<String> set = new HashSet<>();
    
    int n = sc.nextInt();
    
    for (int i = 0; i < n; i++) {
      set.add(sc.next().trim());
    }
    
    System.out.println(set.size());
  }
}