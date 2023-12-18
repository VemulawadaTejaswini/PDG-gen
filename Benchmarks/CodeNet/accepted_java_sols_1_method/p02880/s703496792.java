import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    String ans = "No";
    for(int i = 1; i < 10; i++){
      if(A%i == 0 && A/i < 10){
        ans = "Yes";
      }
    }
    System.out.println(ans);
  }
}