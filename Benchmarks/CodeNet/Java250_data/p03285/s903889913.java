import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
    int a = 4;
    int b = 7;
    String ans = "No";
    for(int i = 0; i <= n; i++){
      for(int j = 0; j <= n-i; j++){
        if(n-(a*i+b*j) == 0){
          ans = "Yes";
          break;
        }
      }
    }
    System.out.println(ans);
  }
}