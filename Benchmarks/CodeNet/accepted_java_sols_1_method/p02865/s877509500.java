import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int ans = 0;
    if(N%2 == 0){
      ans = N/2-1;
    }else{
      ans = N/2;
    }
    System.out.println(ans);
  }
}