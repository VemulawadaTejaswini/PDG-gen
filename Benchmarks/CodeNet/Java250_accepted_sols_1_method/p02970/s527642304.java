import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int d = sc.nextInt();
    int ans = 1;
    for(int i=0; i<n; ++i) {
      if(2*d*i>=n-i) {
        ans = i;
        break;
      }
    }
    System.out.println(ans);
  }
}