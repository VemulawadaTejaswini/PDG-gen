import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
    int D = sc.nextInt();
    int T = sc.nextInt();
    int S = sc.nextInt();
    String X = "";
    if (D==0 || T==0 || S == 0){
      X="No";
      return;
    }
    if(D/S <= T) {
      X="Yes";
      return;
    } else if(D/S > T) {
      X="No";
    }
    
    System.out.println(X);
  }
}
