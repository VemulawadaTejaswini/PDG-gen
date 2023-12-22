import java.util.*;
class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    
    int a1 = a;
     a = b;
     b = a1;
    
    int a2 = a;
     a = c;
     c = a2;
    
    System.out.println(a+" "+b+" "+c);
  }
}