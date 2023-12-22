import java.util.*;
 
public class Main{
	public static void main(String[] args){
	    Scanner sc = new Scanner(System.in);
    	int num = sc.nextInt();
        int e = 0;
        for(int i = 1; i < num + 1; i++){
            if(num == 1){
            	e = 1;
            }else{
        		for(int j = 2; j < num; j++){
            		if((Math.pow(i,j) <= num) && (e < Math.pow(i,j))){
                		e = (int)Math.pow(i,j);
                	}
            	}
            }
        }
        System.out.println(e);
	}
}