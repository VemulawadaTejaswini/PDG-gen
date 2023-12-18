import java.util.*;
class Main {
  public static void main (String[] args)  {
    
    Scanner sc = new Scanner(System.in);
    
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    
    int sum = a+b+c;
    
    int n1=Math.max(Math.max(a,b),c);
    
    sum = sum+n1*9;
    
    System.out.println(sum);

  }
}