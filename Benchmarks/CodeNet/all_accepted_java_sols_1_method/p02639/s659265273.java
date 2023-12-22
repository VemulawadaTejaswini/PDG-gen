import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] input = sc.nextLine().split(" ");
    for(int i = 0; i < input.length; i++) {
      if ("0".equals(input[i])) {
        System.out.println(i + 1);
        return;
      }
    }
  }
}