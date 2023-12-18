import java.util.*;

public class Main {
  public static void main(String[] args) {    
	Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    Set<Integer> arr = new HashSet<>();
    for(int i = 0; i < n; i++) {
      arr.add(sc.nextInt());
    }
    System.out.println(arr.size());
  }
}