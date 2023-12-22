import java.util.*;
 
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      	int a = sc.nextInt();
      	int b = sc.nextInt();
      	long min = Integer.MAX_VALUE;
      	sc.close();
      	if(b - a >= 2019){
        	System.out.print(0);
        }
      	else{
      	for(long i = a; i < b; i ++){
          	for(long j = i + 1; j <= b; j ++){
            	if(min > ((i * j) % 2019)){
                	min = (i * j) % 2019;
                }
              	if(min == 0){
                	break;
                }
            }
        }
          System.out.print(min);
        }
      	
      	
    }
 
}