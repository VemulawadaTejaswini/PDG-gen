import java.util.*;

class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    
    int N = sc.nextInt();
    
    int s = N / 100;
    if(N > (100*s + 10*s + s)) {
      System.out.println(100*(s+1) + 10*(s+1) + (s+1));
    } else {
      System.out.println(100*s + 10*s + s);
    }
  }
}