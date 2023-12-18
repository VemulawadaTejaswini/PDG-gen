import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int H1 = Integer.parseInt(sc.next());
      Scanner scc = new Scanner(System.in);
      int M1 = Integer.parseInt(sc.next());
      Scanner scccc = new Scanner(System.in);
      int H2 = Integer.parseInt(sc.next());
      Scanner scccccc = new Scanner(System.in);
      int M2 = Integer.parseInt(sc.next());
      Scanner sccccccc = new Scanner(System.in);
      int K = Integer.parseInt(sc.next());

      
      int a=60*(H2-H1), b=M2-M1+a;
      int l=b-K;
      System.out.println(l);

      
    }
}
