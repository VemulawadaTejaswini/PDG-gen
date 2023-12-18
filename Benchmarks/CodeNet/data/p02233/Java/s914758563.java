import java.util.*;
public class Main{
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  System.out.println(fib(n));
}
static int fib(int n){
  if(n == 0 || n == 1) return 1;
  int F = 1,Fn1 = 1,Fn2;
  for(int i = 2;i <= n;i++){
    Fn2 = Fn1;
    Fn1 = F;
    F = Fn1 + Fn2;
  }
  return F;
}
} 
