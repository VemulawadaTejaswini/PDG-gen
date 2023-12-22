import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    int ans = 11;
    int a = 0;
    int b = 0;
    int max = 0;
    for(int i = 1; i <= Math.sqrt(n); i++){
      if(n%i == 0){
        a = String.valueOf(i).length();
        b = String.valueOf(n/i).length();
        max = Math.max(a,b);
        if(max < ans){
          ans = max;
        }
      }
    }
    System.out.println(ans);
  }
}