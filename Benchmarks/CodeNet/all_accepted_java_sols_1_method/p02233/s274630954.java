import java.util.*;

class Main{
  static int n=0;
  static long fibonacci[];
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    fibonacci = new long[n];
    if(n >= 1){
      fibonacci[0] = 1;
    }
    if(n >=2){
      fibonacci[1] = 2;
    }
    for(int i = 2; i<n; i++){
      fibonacci[i] = (long)(fibonacci[i-1]+(long)fibonacci[i-2]);
    }
    // System.out.println(Fibonacci(n-1));
    System.out.println(fibonacci[n-1]);

  }

}
