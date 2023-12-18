import java.util.*;

class Main {
  public static void main(String[] args) {
  	Scanner sc = new Scanner(System.in);
    
    int N = Integer.parseInt(sc.next());
    
    int odd = N - (N / 2);
    
    double result = (double) odd / N;
    
    System.out.println(result);
  
  }
}