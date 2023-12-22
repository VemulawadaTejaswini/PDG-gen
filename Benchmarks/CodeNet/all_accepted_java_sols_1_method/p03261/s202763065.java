import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int N = Integer.parseInt(sc.nextLine());
    String[] W = new String[N];
    for (int i=0; i<N; i++) {
      W[i] = sc.nextLine();
    }


    for (int i=1; i<N; i++) {
      for (int j=0; j<i; j++) {
        if (W[i].equals(W[j])) {
          System.out.println("No");
          return;
        }
      }

      char lastChar = W[i-1].charAt(W[i-1].length()-1);
      if (!W[i].startsWith(String.valueOf(lastChar))) {
        System.out.println("No");
        return;
      }
    }

    System.out.println("Yes");

  }
}