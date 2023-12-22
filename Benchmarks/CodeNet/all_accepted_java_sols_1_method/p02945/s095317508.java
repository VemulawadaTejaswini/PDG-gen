import java.util.Scanner;

public class Main{
  public static void main(String ars[]){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int x = a + b;
    int y = a - b;
    int z = a * b;
    int max = Math.max(x,y);
    max = Math.max(max,z);  
    System.out.println(max);
  }
}