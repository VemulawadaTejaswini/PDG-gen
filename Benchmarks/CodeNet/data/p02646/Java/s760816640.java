import java.util.Scanner;
 
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int V = scanner.nextInt();
    int b = scanner.nextInt();
    int W = scanner.nextInt();
    int T = scanner.nextInt();
    int A = Math.abs(a);
    int B = Math.abs(b);
    int k = 0;
    if(A<B){
   		k = B-A;
    }else{
    	k = A-B;
    }
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