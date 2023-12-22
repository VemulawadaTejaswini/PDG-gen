import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    String a = sc.next();
    String b = sc.next();

    int target = Integer.parseInt(a.concat(b));
    int onlimit = 0;
    int count = 1;

    do{
      onlimit = (count*count);
      
      if(onlimit == target){
        System.out.println("Yes");
        break;
        
      }else if(onlimit > target){
         System.out.println("No");
         break;

      }else{
        count++;
      }
      
    }while(onlimit < target);
  }
}
