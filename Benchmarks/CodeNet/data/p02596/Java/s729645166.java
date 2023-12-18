import java.util.*;

public class Main{
 	public static void main(String args[]){
    	Scanner sc = new Scanner();
      	int mod = sc.nextInt();
      	int val = 7%mod;
      	for(int i =0;i<1e7; i++){
         	if(val==0){
              	System.out.println(i);
          		return;
            }
          	val = (val*10+7)%mod;
  
          
        }
      
      	System.out.println("-1");
    } 
}