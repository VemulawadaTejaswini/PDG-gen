import java.util.*;

public class Main {

  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int a = sc.nextInt();
    int b = sc.nextInt();
    
    int result = 0;
    
    for(int i = 1; i <= n; i++){
      
      int sum = 0;

      // 各桁のループ
      for(char num : String.valueOf(i).toCharArray()){
        sum += Integer.parseInt(String.valueOf(num));
      }
      
      if(sum >= a && sum <= b){
        result += i;
      }
      
    }
    
    System.out.println(result);

  }

}