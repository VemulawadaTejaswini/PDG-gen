import java.util.Scanner;

public class Main{
  public static void main(String... args){
    Scanner scanner = new Scanner(System.in);
    
    int s1 = scanner.nextInt() * 60 + scanner.nextInt();
    int s2 = scanner.nextInt() * 60 + scanner.nextInt();
    int t = scanner.nextInt();
    
    System.out.println(Math.max(0, s2 - s1 - t));
  }
}