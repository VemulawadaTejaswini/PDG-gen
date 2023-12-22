import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt(),a = sc.nextInt();
    n = n % 500;
    if(n <= a){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}
