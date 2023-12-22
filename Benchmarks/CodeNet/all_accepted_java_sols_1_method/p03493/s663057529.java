import java.util.Scanner;
public class Main{
  public static void main(String[] argas){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int count = 0;
    if(a / 100 == 1) count++;
    if(a / 10  % 2  == 1) count++;
    if ( a % 2 == 1) count++;
    System.out.println(count);
  }
}