import java.util.*;
class Main{
  static int n=0;
  static int fibonacci[];
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    fibonacci = new int[n];
    if(n >= 1){
    fibonacci[0] = 1;
  }else if(n >=2){
    fibonacci[1] = 2;
  }
    System.out.println(Fibonacci(n-1));

  }

  static int Fibonacci(int n){
    if(n == 0) return fibonacci[0];
    if(n == 1) return fibonacci[1];
    fibonacci[n] = Fibonacci(n-1) + Fibonacci(n-2);
    return fibonacci[n];
  }
}
