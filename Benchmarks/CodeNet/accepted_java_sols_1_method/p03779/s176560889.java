import java.util.Scanner;
 
public class Main {  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long X = Long.parseLong(sc.next());
    long d =0, t =0;
    while (d < X) {
      t++;
      d += t;
    }
    System.out.println(t);
  }
}