import java.util.Scanner;

public class Main{
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      
      long a = sc.nextInt();
      long b = sc.nextInt();
      long c = sc.nextInt();
      long d = sc.nextInt();
      
      long product = a*c;
      
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