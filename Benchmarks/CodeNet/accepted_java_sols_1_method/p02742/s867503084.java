import java.util.*;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long H = sc.nextLong();
    int W = sc.nextInt();
    long s;
    if(H == 1 || W == 1) {
      s = 1;
    } else if(H * W  % 2 == 0) {
      s = H * W / 2;
    } else {
      s = (H * W + 1) / 2;
    }
    System.out.println(s);
  }
}
