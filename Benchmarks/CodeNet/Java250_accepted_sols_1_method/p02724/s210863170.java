import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int X=sc.nextInt();
    int a=X%500;
    int Y=X-a;
    int N=Y/500;
    int b=a%5;
    int Z=a-b;
    int M=Z/5;
    System.out.println((1000*N)+(5*M));
  }
}