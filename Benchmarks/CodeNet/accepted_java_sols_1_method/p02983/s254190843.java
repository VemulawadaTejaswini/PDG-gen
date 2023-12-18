import java.util.*;
 
public class Main {
  public static void main (String[] arg) {
    Scanner scan = new Scanner(System.in);
    long L = scan.nextLong();
    long R = scan.nextLong();
    long min = 2019;
    
    if(R-L >= 2018-(L%2019)){
      System.out.println(0);
      return;
    } else {
      for(Long i = L; i < R; i++){
        for(int j = 1; j <= R-i; j++){
          if((i*(i+j))%2019 < min){
            min = (i*(i+j))%2019;
          }
        }
      }
      System.out.println(min);
    }
  }
}