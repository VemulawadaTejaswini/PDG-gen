import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String[] words = new String[n];
    for(int i = 0; i < n; i++) {
      words[i] = sc.next();
    }
    boolean judge = true;
    for(int i = 0; i < n; i++) {
      for(int j = i + 1; j < n; j++) {
        if(j == n) {
          break;
        }else if (words[i].equals(words[j])) {
          System.out.println("No");
          return;
        }
      }
    }
    for(int i = 0; i < n - 1; i++) {
      if(words[i].charAt(words[i].length() - 1) != words[i + 1].charAt(0)) {
        System.out.println("No");
        return;
      }
    }
    System.out.println("Yes");
  }

}
