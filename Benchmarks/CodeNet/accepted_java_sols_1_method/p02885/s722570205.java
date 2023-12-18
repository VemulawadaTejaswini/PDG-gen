import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();

    int ans = n - 2*m;
    if(ans>0){
      System.out.println(ans);
    }else{
      System.out.println("0");
    }

  }
}
