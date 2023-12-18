import java.util.Arrays;
import java.util.*;
public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String N = String.valueOf(n);
    if(N.charAt(0)==N.charAt(2)){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}