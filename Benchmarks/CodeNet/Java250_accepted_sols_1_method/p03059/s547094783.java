import java.util.*;
import java.math.*;

class Main {
  public static void main(String[] args){
  Scanner stdIn = new Scanner(System.in);
  int a = stdIn.nextInt();
  int b = stdIn.nextInt();
  int T = stdIn.nextInt();
  int count = 0;
  for(int i = a;i<T+0.5;i+=a) {
    count += b;
  }
  System.out.println(count);
}
}