import java.util.Scanner;
 
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int A = scanner.nextInt();
    int V = scanner.nextInt();
    int B = scanner.nextInt();
    int W = scanner.nextInt();
    int T = scanner.nextInt();
    
    int k = B-A;
    int As = V*T;
    int Bs = W*T;
    int s = As-Bs;
    if(k<=s){
      System.out.print("YES");
    }else{
      System.out.print("NO");
    }
   
    scanner.close();
 
  }
 
}