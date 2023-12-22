import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x = Integer.parseInt(sc.next());
    int x00 = x % 100;
    int x3  = (x - x00) / 100;
    
    if(x<100) {
      System.out.println("0");
      return;
    }
    
    int m5 = 0;
    int m1 = 0;
    int m0 = 0;

    m1 = x00 % 5;
    m5 = (x00 - m1) / 5;
    
    if(m1 != 0){
      m1 = 1;
    } else {
      m1 = 0;
    }
      
    if(x3 < m5 + m1) {
      System.out.println("0");
      return;
    }
    
    System.out.println("1");
    
  }
}
