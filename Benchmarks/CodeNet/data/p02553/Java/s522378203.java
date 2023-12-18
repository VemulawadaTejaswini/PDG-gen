import java.util.Scanner;

public class Main{
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      
      int a = sc.nextInt();
      int b = sc.nextInt();
      int c = sc.nextInt();
      int d = sc.nextInt();
      
      int product = a*c;
      
      if(a*d > product){
      	product = a*d;
      }
      if(c*b > product){
      	product = c*b;
      }
      if(b*d > product){
      	product = b*d;
      }
      
      System.out.println(product);
    }
}