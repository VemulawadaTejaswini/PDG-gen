import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    String ans = "No";

    for(int i = 1; i < 10; i++){
      for(int j = 1; j < 10; j++){
        if(n == i * j){
          ans = "Yes";
        }
      }
    }

    System.out.println(ans);
  }
}
