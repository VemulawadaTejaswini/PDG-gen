import java.util.*;

public class Main {
  public static void main(String... args) {
    Scanner scan = new Scanner(System.in);
    int M = scan.nextInt();
    int D = scan.nextInt();
    scan.close();
    
    int res=0, tmp=0;
    int d1=0, d10=0;
    for(int i=22; i<=D; i++) {
      d1 = i%10;
      d10 = i/10;
      if(d1<2 || d10<2) continue;

      tmp = d1 * d10;
      if(0<tmp && tmp<=M) res++;
    }
    
    System.out.println(res);
  }
}