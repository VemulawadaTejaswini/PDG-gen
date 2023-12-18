import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int m = scan.nextInt();
    if (m<n){
      System.out.println("No");
    }
    else{
      System.out.println("Yes");
    }
  }
}
