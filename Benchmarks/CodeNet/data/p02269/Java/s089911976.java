import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.nextLine());
    Set<String> dictionary = new HashSet<>();
    String[] arr = new String[2];
    for(int i = 0; i < n; i++) {
      arr = sc.nextLine().split(" ");
      if(arr[0].equals("insert")) {
        dictionary.add(arr[1]);
      } else {
        if(dictionary.contains(arr[1])) {
          System.out.println("yes");
        } else {
          System.out.println("no");
        }
      }
    }
  }
}

