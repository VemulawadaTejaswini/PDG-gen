import java.util.*;
 
public class Main{
	public static void main(String[] args){
	    Scanner sc = new Scanner(System.in);
    	int num = sc.nextInt();
        int q = num / 100;
        int r = num % 100;
        for(int i = 0; i < q; i++){
        	if(r >= 5){
            	r -= 5;
            }else if(r >= 4){
            	r -= 4;
            }else if(r >= 3){
            	r -= 3;
            }else if(r >= 2){
            	r -= 2;
            }else if(r >= 1){
            	r -= 1;
            }
        }
        if(r == 0){
        	System.out.println("1");
        }else{
        	System.out.println("0");
        }
	}
}