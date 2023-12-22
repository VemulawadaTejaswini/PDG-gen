import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.nextLine());
    int count = 0;
    for(int i = 0; i < N; i++){
      int n = Integer.parseInt(sc.next());
      if(n%2 == 1){
        count++;
      }
    }
    System.out.println(count%2==1 ? "NO" : "YES");
  }
}