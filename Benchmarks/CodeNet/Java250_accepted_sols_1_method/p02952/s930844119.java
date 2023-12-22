import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int ans = 90909;

    if(n < 10){
      ans = n;
    } else if(n < 100){
      ans = 9;
    } else if(n < 1000){
      ans = n - 90;
    } else if(n < 10000){
      ans = 909;
    } else if(n < 100000){
      ans = n -9090;
    }

    System.out.println(ans);
  }
}
