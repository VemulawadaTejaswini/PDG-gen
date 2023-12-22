import java.util.Scanner;

public class Main{
  public static void main(String args[]){
    Scanner scanner = new Scanner(System.in);
    double d = scanner.nextInt();
    double t = scanner.nextInt();
    double s = scanner.nextInt();
    if((d/s)>t){
     System.out.print("No");    
    }else{
     System.out.print("Yes");    
    }
    
    
  }
}

