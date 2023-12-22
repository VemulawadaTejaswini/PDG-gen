import java.util.*;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    System.out.println(sum(n)-sum(n/3)*3-sum(n/5)*5+sum(n/15)*15);
        
	
	}
  static long sum(long n){
    return (1 + n) * n / 2;
  }
}
