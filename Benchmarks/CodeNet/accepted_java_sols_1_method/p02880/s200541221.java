import java.util.*;

class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    String ans = "No";
    BREAK:for (int i=0;i<=9;i++){
      for (int j=0;j<=9;j++){
        if ((i*j)==N){
          ans = "Yes";
          break BREAK;
        }
      }
    }
    System.out.println(ans);
  }
}