import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    String ans = a%2==1&&b%2==1?"Yes":"No";
    System.out.println(ans);


  }
}