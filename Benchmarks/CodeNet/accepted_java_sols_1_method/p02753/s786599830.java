import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String station = sc.next();
    String word = "No";
    for (int i = 1; i < 3; i++) {
      if (station.charAt(i-1) != station.charAt(i))
        word = "Yes";
    }
    System.out.println(word);
  }

}