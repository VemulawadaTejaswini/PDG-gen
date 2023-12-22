import java.util.*;

public class Main{

	public static void main(String[] args){
    
      Scanner sc=new Scanner(System.in);
      
      String str=sc.next();
      
      String[] data=str.split("");
      
      int counter=0;
      
      for(String s:data){
      		if(s.equals("1")){
            	counter++;
            }
      }
      
      System.out.println(counter);
      
    }
}