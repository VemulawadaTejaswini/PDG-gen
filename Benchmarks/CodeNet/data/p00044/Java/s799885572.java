import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    
    while (in.hasNext()) {
      int num = in.nextInt();
      int pre =  num - 1;
      int post = num + 1;
      
      boolean sieve[] = new boolean [50022];
      for(int n = 2; n < Math.sqrt(num); n++){
        if (sieve[n]) continue;
        for (int m = 2 * n; m < sieve.length; m += n) {
          sieve[m] = true;
        }
      }
      
      for (int i = pre;  sieve[i]; i--) pre  = i - 1;
      for (int i = post; sieve[i]; i++) post = i + 1;
      System.out.println(pre + " " + post);
    }
  }
}