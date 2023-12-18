import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		
      	Scanner sc = new Scanner(System.in);
      	long X = sc.nextLong();
     	long K = sc.nextLong();
		long D = sc.nextLong();
      	
      	for(long k = 0; k < K; k++){
        	if(X < 0){
            	X += D;
            }else{
            	X -= D;
            }
        }
      	System.out.println(Math.abs(X));
	}
}