import java.util.*;
import java.util.regex.Pattern;

public class Main {

  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int a = sc.nextInt();
    int b = sc.nextInt();
    
    int result = 0;
    
    Pattern p = Pattern.compile("");
    
    for(int i = 1; i <= n; i++){
      
      int sum = p
        .splitAsStream(String.valueOf(i))
        .mapToInt(Integer::valueOf)
        .sum();
      
      if(sum >= a && sum <= b){
        result += i;
      }
      
    }
    
    System.out.println(result);

  }

}