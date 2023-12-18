import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    
    boolean sieve[] = new boolean [1000000];
    for(int n = 2; n < sieve.length; n++){
      if (sieve[n]) continue;
      for (int m = 2 * n; m < sieve.length; m += n) {
        sieve[m] = true;
      }
    }
    while (in.hasNext()) {
      int num = in.nextInt();
      int count = 0;
      for (int i = 2; i <= num; i++) {
        if (!sieve[i]) count++;
      }
      System.out.println(count);
    }
  }
}