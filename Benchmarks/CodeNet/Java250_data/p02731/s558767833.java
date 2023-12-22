import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int L = scanner.nextInt();
    double answer = 0;
    
    answer = Math.pow(L,3) / (double)27;
    System.out.println(answer);
  }
}