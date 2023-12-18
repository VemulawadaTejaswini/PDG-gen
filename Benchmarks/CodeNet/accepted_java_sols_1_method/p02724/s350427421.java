import java.util.Scanner;

public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int fh = a / 500;
    a = a - (fh * 500); 
    int f = a / 5;
    int ans = (fh * 1000) + (f * 5);
    System.out.println(ans);
  }
}