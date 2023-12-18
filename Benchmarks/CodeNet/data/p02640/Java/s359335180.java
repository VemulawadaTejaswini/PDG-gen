import java.util.Scanner;
import java.lang.*;

public class Main{
 
	public static void main(String args[]){

      Scanner sc1 = new Scanner(System.in);
      Scanner sc2 = new Scanner(System.in);	
      
      int sc1; //頭の数
      int sc2;//足の数
      
      int legs = sc2 % 4;
      
      if(legs % 2 ==0){
        System.out.println("Yes");
      }else{
        System.out.println("No");        
      }
      
      
    }      
}
