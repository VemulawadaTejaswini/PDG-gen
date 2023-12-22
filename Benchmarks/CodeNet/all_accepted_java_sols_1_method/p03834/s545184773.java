import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    String[] word = scanner.next().split(",");
    
    System.out.println(word[0] + " "+ word[1] + " " + word[2]);
  }
}