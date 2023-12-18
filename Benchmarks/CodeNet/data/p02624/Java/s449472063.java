import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in){
          int k = sc.nextInt();
          int sum = 0;
          if(k == 1){
          	System.out.println(k);	
          }
          for(int i=1; i<=k; i++){
          	  sum = sum + (i*i);
          }
          System.out.println(sum);
        }
    }
}