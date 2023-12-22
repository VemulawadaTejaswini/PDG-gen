import java.util.*;
public class Main {
	public static void main(String[] args){
      	//データ取り込み
		Scanner sc = new Scanner(System.in);
      	long K = sc.nextLong();
      	long A = sc.nextLong();
      	long B = sc.nextLong();
      	long num = 0;
      	long keisan = 0;
      	
      	keisan = A + (K-A+1)/2*(B-A);
      	
		
        	if((K-A+1)%2 == 1){
            	keisan++;
              	if(A < B+2 && K > A && 1+K < keisan){
                  	num = keisan;
	            }else{
            		num = 1+K;
	            }
        	}else{
        		if(A < B+2 && K > A && 1+K < keisan){
                  	num = keisan;
	            }else{
            		num = 1+K;
	            }
     	   }
      	System.out.print(num);
    }
}