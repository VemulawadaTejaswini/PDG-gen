import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);    
    int num = scan.nextInt();
    scan.close();
        
    int hapiness = 0;
    
    hapiness += (num / 500) * 1000;
    
    hapiness += ((num % 500) / 5) * 5;
    
    System.out.println(hapiness);
  }
}
