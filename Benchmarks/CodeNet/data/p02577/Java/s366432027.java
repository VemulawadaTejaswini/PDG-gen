import java.util.Scanner;
public class Main {
  public static void main(final String[] args){
    Scanner scan = new Scanner(System.in);
    long n = scan.nextLong();
    
    if(sumDigits(n)%9 == 0){
       System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
  
  
  public static int sumDigits(long n) {
    int sum = 0;
    while (n != 0) {
      sum += n % 10;
      n /= 10;
    }
    return sum;
  }
}