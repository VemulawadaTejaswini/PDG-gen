import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long n = Long.parseLong(sc.next());
    long k = Long.parseLong(sc.next());
    long a = n - (n/k)*k;
    long b = k-a;
    System.out.print(Math.min(a,b));
    System.out.flush();
  }
}