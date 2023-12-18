import java.util.Arrays;
import java.util.Scanner;
 
 
public class Main{

	
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	
    	final int N = sc.nextInt();
    	
    	NEXT:
    	for(int tt = 0; tt < N; tt++){
    		int[][] array = new int[3][10];
    		int[] count = new int[3];
    	
    		int[][] card = new int[2][9];
    		for(int i = 0; i < 9; i++){
    			card[0][i] = sc.nextInt();
    		}
    		for(int i = 0; i < 9; i++){
    			String in = sc.next();
    			
    			if("R".equals(in)){
    				card[1][i] = 0;
    				count[0]++;
    			}else if("G".equals(in)){
    				card[1][i] = 1;
    				count[1]++;
    			}else if("B".equals(in)){
    				card[1][i] = 2;
    				count[2]++;
    			}
    		}
    		
    		for(int i = 0; i < 9; i++){
    			array[card[1][i]][card[0][i]]++;
    		}
    		
    		for(int i = 0; i < 3; i++){
    			if(count[i] % 3 != 0){
    				System.out.println(0);
    				continue NEXT;
    			}
    		}
    		
    		for(int i = 0; i < 3; i++){
    			for(int num = 0; num < 10; num++){
    				if(array[i][num] >= 3){
    					array[i][num] %= 3;
    				}
    				
    				if(array[i][num] > 0){
    					if(num >= 8){
    						System.out.println(0);
    						continue NEXT;
    					}
    					
    					if(array[i][num+1] > 0 && array[i][num+2] > 0){
    						array[i][num]--;
    						array[i][num+1]--;
    						array[i][num+2]--;
    						num -= 1;
    					}else{
    						System.out.println(0);
    						continue NEXT;
    					}
    				}
    			}
    		}
    		
    		System.out.println(1);
    	}
    }
     
}