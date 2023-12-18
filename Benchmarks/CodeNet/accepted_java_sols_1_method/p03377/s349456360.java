import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt(), B = sc.nextInt(), X = sc.nextInt();
    //There has to be at least A cats
    //There can be at most A+B cats
    //If X is between A and A+B, then it is possible
    if(X >= A && X <= A+B){
      System.out.println("YES"); 
    }
    else{
      System.out.println("NO"); 
    }
  }
}