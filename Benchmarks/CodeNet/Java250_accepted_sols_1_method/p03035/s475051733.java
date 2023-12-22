import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    int a = stdIn.nextInt();
    int b = stdIn.nextInt();
    int count = 0;
    if(a>=13) {
      count += b;
    } else if(a<=12&&a>=6) {
      count += (b/2);
    } else {
      count = 0;
    }
    System.out.println(count);
  }
}