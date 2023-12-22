import java.util.*;
public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);

    int A = sc.nextInt();
    int B = sc.nextInt();

    int  max = Math.max(A,B);

    for(int k = 0 ;k<max;k++){
       int AA = Math.abs(A-k);
       int BB = Math.abs(B-k);

        if(AA==BB){
          System.out.println(k);
          System.exit(0);
        }
    }
    System.out.println("IMPOSSIBLE");
  }
}