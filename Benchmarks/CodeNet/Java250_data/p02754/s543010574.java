import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    long a = sc.nextLong();
    long b = sc.nextLong();
    long c = n/(a+b);
    long d = n-(a+b)*c;
    System.out.println(c*a+Math.min(a,d));
    
    
  }
}
