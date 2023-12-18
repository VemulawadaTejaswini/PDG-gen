import java.util.Scanner;

public class Main{
  
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int n = Integer.parseInt(scanner.nextLine());
    int k = Integer.parseInt(scanner.nextLine());
    int x = Integer.parseInt(scanner.nextLine());
    int y = Integer.parseInt(scanner.nextLine());
    
    if(n>=k){
      System.out.println(k*x + (n-k)*y);
    }
    else{
      System.out.println(n*x);
    }
  }
}