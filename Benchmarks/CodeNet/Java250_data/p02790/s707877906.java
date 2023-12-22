import java.util.*;

public class Main {
  public static void main(final String[] args) {
    final Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    sc.close();

    String aw = "";
    for(int i=0;i<B;++i){
      aw += String.valueOf(A);
    }
    String bw = "";
    for(int i=0;i<A;++i){
      bw += String.valueOf(B);
    }

    if (aw.compareTo(bw) < 0) {
      System.out.println(aw);
    } else {
      System.out.println(bw);
    }
  }
}
