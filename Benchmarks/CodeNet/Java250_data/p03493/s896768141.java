import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int s = sc.nextInt();
    int a = s - 9 * (s / 100) - 9 * (s / 10);
    System.out.println(a);
    sc.close();
  }
}
