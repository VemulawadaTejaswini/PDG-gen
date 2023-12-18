import java.util.*;

class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    double sum = 0;
    for(int i = 0; i < n; i++){
      double a = sc.nextInt();
      sum += 1/a;
    }
    double ans = 1/sum;
    System.out.print(ans);
  }
}
