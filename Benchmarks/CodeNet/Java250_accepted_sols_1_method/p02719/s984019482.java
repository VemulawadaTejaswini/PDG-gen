import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    long n = scan.nextLong();
    long k = scan.nextLong();
    
    long digit = n % k;
    System.out.println(digit < k - digit ? digit : k - digit);
  }
}