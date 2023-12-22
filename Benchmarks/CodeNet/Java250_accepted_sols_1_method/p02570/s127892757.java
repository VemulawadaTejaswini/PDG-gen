import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
    double D = sc.nextDouble();
    double T = sc.nextDouble();
    double S = sc.nextDouble();
    double x = D/S;
    String X = "";
    if (D==0 || T==0 || S == 0){
      X="No";
      return;
    }
    
    if(x<=T) {
      X="Yes";
    } else if (x>T) {
      X="No";
    }
    
    System.out.println(X);
  }
}
