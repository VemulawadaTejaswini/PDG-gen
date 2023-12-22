import java.util.Scanner;

public class Main{
  public static void main(String args[]){
    Scanner scanner = new Scanner(System.in);
    double n = scanner.nextInt();
    double x = scanner.nextInt();
    double t = scanner.nextInt();

    int kaisu = (int)Math.ceil(n/x); 
    //System.out.println(kaisu);
    System.out.println((int)t*kaisu);
    
  }
}

