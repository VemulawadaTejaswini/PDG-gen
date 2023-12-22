import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int hour = sc.nextInt();
    System.out.println(24 - hour + 24);
  }
}