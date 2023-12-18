import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int make = sc.nextInt();
    int max = sc.nextInt();
    int time = sc.nextInt();
    int count = (int)(make / max);
    
    System.out.println(time * count);
    
  }
    