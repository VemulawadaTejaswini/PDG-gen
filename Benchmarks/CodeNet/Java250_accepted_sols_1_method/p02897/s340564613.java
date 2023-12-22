import java.util.Scanner;
 public class Main {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        
      int a =N/2;
      int b =(N/2)+1;
      
      double c =a;
      double d =b;
      
      if(N%2==0){
      System.out.print(c/N);
      }
      else if(N%2!=0){
      System.out.print(d/N);
      }
    }
 }