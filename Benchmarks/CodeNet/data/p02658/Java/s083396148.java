import java.util.*;
 
public class Main{
	public static void main(String[] args){
	    Scanner sc = new Scanner(System.in);
    	int num = sc.nextInt();
        long number[] = new long[num];
        for(int i = 0; i < num; i++){
        	number[i] = sc.nextLong();
        }
        long mul = 1;
        for(int i = 0; i < num; i++){
          if(mul < Math.pow(10,18)/mul){
        	mul = mul * number[i];
          }else{
          	mul = -1;
          }
        }
        System.out.println(mul);
	}
}