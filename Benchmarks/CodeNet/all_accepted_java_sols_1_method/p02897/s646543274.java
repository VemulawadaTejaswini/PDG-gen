import java.util.*;
public class Main{
  public static void main(String[] args){
  	Scanner stdIn = new Scanner(System.in);
    	int a = stdIn.nextInt();
    	int kisuu = 0;
    		for(int i = 1; i <= a; i++){
              if(i%2!=0){
                kisuu++;
              }
            }
         System.out.println((double)kisuu/(double)a);
            }
  }
           