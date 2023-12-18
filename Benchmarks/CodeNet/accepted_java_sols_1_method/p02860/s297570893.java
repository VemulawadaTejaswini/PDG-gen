import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    String S = sc.next();

    String mae = S.substring(0, N/2) ;
    String ato = S.substring(N/2, N);
    
    if(N % 2 == 1){
      System.out.println("No");
    }else if(mae.equals(ato)){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }

}
}
