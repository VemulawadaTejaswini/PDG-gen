import java.util.*;
public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    for(int i=9 ; i>0 ; i--){
      if(n%i==0){
        if(1<=n/i && n/i<=9){
          System.out.println("Yes");
          break;
        }
      }else{
        continue;
      }
      System.out.println("No");
      break;
    }
  }
}
