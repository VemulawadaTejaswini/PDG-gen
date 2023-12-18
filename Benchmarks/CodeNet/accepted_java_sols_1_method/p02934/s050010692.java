import java.util.Scanner;
public class Main{
  public static void main(String[]args){

    Scanner scan = new Scanner(System.in);

    double ans = 0;
    int c = scan.nextInt();
    for(int i=0;i<c;i++){
      double t = (double) scan.nextInt();
      ans += 1.0/t;
    }
    
    System.out.println(1.0/ans);
  }
}