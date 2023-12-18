import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    
    int cnt = 0;

    for(int i = 1 ; i <= n ; ++i){
      int count = 0;
      
      if(i%6==0){
        
      }
      int a = i/3;
      int b = a%2;
      int c = i%3;
      int d = i/6;
      if(i%6==0 && !(i==12)){
        count = i/6;
        cnt++;
      }else if(i>=6 && b==1 && c==2){
        
        if(cnt*6<i && i <(cnt+1)*6){
          count = i/6+2;
          
        }else{
          count = i/6+1;
        }
        
      }

      System.out.println(count);
    }
  }
}