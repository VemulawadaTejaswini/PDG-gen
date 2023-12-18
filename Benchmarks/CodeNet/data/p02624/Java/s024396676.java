import java.util.*;

public class Main{
	public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      
      int n = sc.nextInt();
      int result = 0;
      
      for(int i=1; i <= n; i++){
        int cnt = 1;
        for(int j = 1; j <= i/2; j+=2){
          if(i%j == 0){
            cnt++;
          }
          if((i+1)/2 >= j && (i+1)%j == 0){
            cnt++;
          }
        }
        result += i * cnt;
      }
      
      System.out.print(result);
    }
}
