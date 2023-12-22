import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		
      	Scanner sc = new Scanner(System.in);
      	long X = Math.abs(sc.nextLong());
     	long K = sc.nextLong(); //回数
		long D = sc.nextLong(); //移動距離
      	
      	long min_d = X % D;      
      	long req_k = X / D;
      
      	if(min_d > D / 2){
          min_d = D - min_d;
          req_k++;
        }
      
      	if(K == req_k){
        	System.out.println(min_d);
        }else if( K > req_k){
        	if((K - req_k) % 2 == 0){
            	System.out.println(min_d);
            }else{
            	System.out.println(D - min_d);
            }
        }else{
          System.out.println(X - K * D);
        }
	}
}