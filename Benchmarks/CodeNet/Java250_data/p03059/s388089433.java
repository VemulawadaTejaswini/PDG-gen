import java.util.*;

public class Main {
  
  private int A, B, T;
  
  public Main(int a, int b, int c) {
    this.A = a;
    this.B = b;
    this.T = c;
  }
  
  private void getBuiscit () {
    System.out.println(T/A*B);
  }
    
  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
    
    Main obj = new Main(scan.nextInt(), scan.nextInt(), scan.nextInt());
    obj.getBuiscit();
    
  }
}
