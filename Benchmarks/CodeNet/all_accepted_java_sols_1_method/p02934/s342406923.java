import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    double ans = 0.0;
    double a;

    for(int i=0;i<n;i++) {
      a=sc.nextDouble();
      ans = ans+ 1/a;
    }
    ans = 1/ans;
    System.out.println(ans);
    
}
}
