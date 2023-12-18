import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int ans = 0;
    int count = 0;

    for(int j = 105 ; j <= n ; ++j){ 
      if(j%2!=0){
   	 for(int i = 1 ; i <= j ; ++i){ 
      if(j%i==0){
        count++;
      } 
     }
      }
     if(count == 8){
          ans++;
     }
     count = 0;
    }
    
    System.out.println(ans);
    
  }
}
