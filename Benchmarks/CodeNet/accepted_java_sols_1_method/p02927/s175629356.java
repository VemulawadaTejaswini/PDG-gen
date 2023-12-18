import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int m = sc.nextInt();
    int d = sc.nextInt();
    int count = 0;
    
    for(int i = 2 ; i <= m ; ++i){
      for(int j = 2 ; j <= d ; ++j){
        int d10 = j/10;
        int d1 = j%10;
        if(d10 != 1 && d1 != 1 && i==d10*d1){
          count++;
        }
      }
      
    }
    
    System.out.println(count);
    
  }
}