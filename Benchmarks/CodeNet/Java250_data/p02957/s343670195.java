import java.util.*;
 
public class Main {
  public static void main (String[] arg) {
    Scanner scan = new Scanner(System.in);
    int A = scan.nextInt();
    int B = scan.nextInt();
    int K = 0;
    int check = 0;
    
    if((A+B)%2 == 0){
      K = (Math.abs(A)+Math.abs(B))/2;
      check++;
    }
    
    if(check == 0){
      System.out.println("IMPOSSIBLE");
    } else {
      System.out.println(K);
    }
    
  }
}