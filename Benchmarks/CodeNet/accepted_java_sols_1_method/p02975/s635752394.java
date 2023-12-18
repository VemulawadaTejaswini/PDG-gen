import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.nextLine());
    long ans = 0;
    for(int i = 0; i < N; i++){
      long n = Long.parseLong(sc.next());
      if(i == 0){
        ans = n;
      }else{
        ans = ans^n;
      }
    }

    System.out.println(ans == 0 ? "Yes" : "No");
  }
}