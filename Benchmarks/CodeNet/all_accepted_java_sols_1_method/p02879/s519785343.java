import java.util.*;
 
public class Main{
  public static void main (String args[]){
    Scanner sc = new Scanner(System.in);
    int numA = sc.nextInt();
    int numB = sc.nextInt();
    int ans = 0;
    
    if (numA <= 9 && numB <= 9){
      ans = numA*numB;
    } else {
      ans = -1;
    }
    System.out.println(ans);
  }
}