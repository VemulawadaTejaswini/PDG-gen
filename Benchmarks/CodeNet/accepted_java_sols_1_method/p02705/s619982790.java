import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int R = scanner.nextInt();
    double answer = Math.PI * R * 2;
    System.out.println(answer);
  }
}