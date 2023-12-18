import java.util.Scanner;
 
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a=sc.nextInt();
    double b=sc.nextDouble();
    double x=a*b;
    int n=(int)x;
    System.out.println(n);
  }
}