import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.print("Christmas");
    for(int i = n; i < 25; i++){
      System.out.print(" Eve");
    }
  }
}