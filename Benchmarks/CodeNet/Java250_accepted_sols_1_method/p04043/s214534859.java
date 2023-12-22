import java.util.Scanner;
 
public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();
    
    if((A+B+C) == 17){
    System.out.println("YES");
    }
    else {
    System.out.println("NO");
    }
  }
}
 