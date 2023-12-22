import java.util.*;
 
public class Main{
	public static void main(String[] args){
	    Scanner sc = new Scanner(System.in);
    	int num = sc.nextInt();
        long number[] = new long[num];
        long mul = 1;
        for(int i = 0; i < num; i++){
        	number[i] = sc.nextLong();
            if(number[i] == 0){
            	mul = 0;
            }
        }
        if(mul != 0){
        	for(int i = 0; i < num; i++){
          		if(number[i] <= (long)Math.pow(10,18)/mul){
        			mul = mul * number[i];
          		}else{
          			mul = -1;
                    break;
                }
          	}
        }
        System.out.println(mul);
	}
}