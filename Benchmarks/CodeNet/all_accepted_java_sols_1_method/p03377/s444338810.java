import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt(), B = sc.nextInt(), X = sc.nextInt();
    if(X >= A && X <= A+B){
      System.out.println("YES"); 
    }
    else{
      System.out.println("NO"); 
    }
  }
}