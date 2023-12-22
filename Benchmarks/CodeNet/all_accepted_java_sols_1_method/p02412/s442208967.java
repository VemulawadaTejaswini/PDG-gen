import java.util.Scanner;
 
class Main{
	public static void main(String[] args){
        	Scanner sc = new Scanner(System.in);
	        int x,y,z;
        	while(true){
            		x = sc.nextInt();
            		y = sc.nextInt();
            		if( x == 0 && y == 0 ){
				 break;
			}
            		z = 0;
            		for(int i = 1; i <= x-2; i++){
                		for(int j = 2; j <= x-1; j++){
                    			for(int k = 3; k <= x; k++){
                        			if(i >= j || i >= k || j >= k){
							 continue;
                        			}
						if(i + j + k == y){
							 z++;
						}
					}
				}
                    	}
          	System.out.println(z);
        	}
    	}
}