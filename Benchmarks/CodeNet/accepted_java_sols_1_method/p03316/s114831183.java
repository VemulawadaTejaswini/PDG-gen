import java.util.*;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = N;
    int sum = 0;

    while(M!=0){
      sum+=M%10;
      M/=10;
    }
    if(N%sum==0){
      System.out.println("Yes");
    }
    else{
      System.out.println("No");
    }
  }
}