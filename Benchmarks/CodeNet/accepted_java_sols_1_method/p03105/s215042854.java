import java.util.Scanner;
import java.lang.Math;
public class Main {
  public static void main (String[]args) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();

    int ans = 0;
    if(B/A > C){
      ans = C;
    } else{
      ans =  B/A;
    }
    
    System.out.println(ans);
  }
}
