import java.util.Scanner;
public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    double m = 0;

    if(1<=n && n<=100){
      if(n%2==0){
        m = (double)(n/2)/n;
        System.out.println(m);
      }
      if(n%2==1){
        m = (double)((n+1)/2)/n;
        System.out.println(m);
      }
    }
  }
}
