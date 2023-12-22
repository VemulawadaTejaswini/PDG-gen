import java.util.Scanner;
class Main {
  public static void main(String args[]){
    Scanner  sc = new Scanner(System.in);
    long n , k ,i,t;
    n = sc.nextLong();
    k = sc.nextLong();
    i = n%k;
    t = Math.abs(k-i);
    if(i > t){
      i = t;
    }
    System.out.println(i);
  }
}
