import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();
    int D = sc.nextInt();
    String S = "";
    for(int i=0; i<100; i++) {
      C -= B;
      A -= D;
      if(C<=0) {
        S = "Yes";
        break;
      }
      if(A<=0) {
        S = "No";
        break;
      }
    }
        System.out.println(S);
  }
}