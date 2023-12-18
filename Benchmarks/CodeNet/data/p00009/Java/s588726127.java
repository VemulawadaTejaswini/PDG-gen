import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    while(sc.hasNext()) {
      int n = sc.nextInt();
      int counter = 0;
      boolean[] isprime = new boolean[n+1];
      for (int i = 2; i <= n; i++) {
        isprime[i] = true;
      }
      for (int i = 2; i*i <= n; i++) {
        if(isprime[i]) {
          for (int j = 2*i; j <= n; j += i) {
            isprime[j] = false;
          }
        }
      }
      for (int i = 0; i <= n; i++) {
        if(isprime[i]) {
          counter++;
        }
      }
      System.out.println(counter);
    }
  }
}