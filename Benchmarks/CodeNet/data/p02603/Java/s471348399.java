import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      	
      	int n = sc.nextInt();
     	long as[] = new long[n];
      	long money = 1000;
      	long stock = 0;
      	    
      	for(int i = 0;i < n;i++) as[i] = sc.nextLong();
      
      	long ystock = as[0];
       	
      	for(int i = 1;i < n;i++){
          	if(ystock <= as[i]){
            	stock = money/ystock;
              	money -= stock*ystock;
				money += stock*as[i];              
            }
          	ystock = as[i];
        }
      
      	System.out.println(money);
	}
}
