import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int a = scan.nextInt();
    for (int i=0;i<a;i++){
      int t = scan.nextInt();
      if (t%2 != 0){
        continue;
      }
      else{
        if ((t%3 == 0) || (t%5 == 0)){
          continue;
        }
        System.out.println("DENIED");
        return;
      }
    }
    System.out.println("APPROVED");
  }
}
