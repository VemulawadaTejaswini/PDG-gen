import java.util.*;
public class Main {
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    long a = n % 1000;
    a = ( 1000 - a ) % 1000 ;
    System.out.println( a );
  }
}