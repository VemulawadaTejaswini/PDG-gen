import java.util.*;
import java.util.Arrays;
public class Main{
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
      int c = sc.nextInt();
      int k = sc.nextInt();
      int sum =  0;
      for(int i=0;i<k;i++){
        if(a!=0){
          sum +=1;
          a--;
        }
        else if(b!=0){
          sum += 0;
          b--;
        }
        else{
          sum -=1;
          c--;
        }
      }
      System.out.println(sum);

    
     

      
    }
}