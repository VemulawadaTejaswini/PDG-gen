import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    long h = sc.nextLong();
    
    long result = 2;
    while(result<=h) {
      result *= 2;
    }
    
    result -= 1;
    System.out.println(result);
    
  }
}