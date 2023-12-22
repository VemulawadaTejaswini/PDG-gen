import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);    

    int min = 9999999;
    int needPowder = 0;
    int n = sc.nextInt();
    int powder = sc.nextInt();
    
    for(int i = 0; i < n; i++){
      int tmp = sc.nextInt();
      needPowder += tmp;
      
      if(tmp < min){
        min = tmp;
      }
    }
    
    System.out.println(n + ((powder - needPowder) / min));
  }
}
