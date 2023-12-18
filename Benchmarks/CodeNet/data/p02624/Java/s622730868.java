import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    long res = 1, lim = n/2, i = 2, count = 1;
    
    while(i <= n) {
      if(n%i == 0) {
        count++;
      }
      res += i*count;
      System.out.println(i+" "+count+" "+res);
      i++;
    }
    System.out.println(res);
  }
}

