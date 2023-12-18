package helloworld;
import java.util.*;

class Howmanyways {
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		while(true){
		
		    //整数nとxを受け取る
		    String s1 = sc.next();
		    int n = Integer.parseInt(s1);
		    String s2 = sc.next();
	        int x = Integer.parseInt(s2);
	        if(n == 0 && x == 0){
	        	break;
	        }
		
	        int count = 0;
		
	        for(int i = 1; i <= n; i++){
		        for(int j = i+1; j <= n; j++){
			        for(int k = j+1; k <= n; k++){
				        if(i + j + k == x){
					        count++;
				        }
			        }
		        }
	        }
	        System.out.println(count);
		}
	}
}