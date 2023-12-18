import java.util.Scanner;
 
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long a=sc.nextLong();
    double b=sc.nextDouble();
    double x=a*b;
    long n=(long)x;
    System.out.println(n);
  }
}