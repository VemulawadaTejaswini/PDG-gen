import java.util.*;

public class Main {
  public static void main(String[] args ) throws Exception {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int fun = N;
    while(sc.hasNext()){
        // System.out.println(sc.nextInt());
        fun -= sc.nextInt();
    }
    if(fun >= 0){
        System.out.println(fun);
    } else {
        System.out.println(-1);
    }
  }
}