import java.util.*;

class Main{
    public static void main(String[] args){
    	Scanner scn = new Scanner(System.in);
    	int n;
    	int[] list = new int[4000];
    	
    	for(n=scn.nextInt(); n!=0; n=scn.nextInt()){
    		boolean flag = false;
    		int num,exceed = 0;
    		
    		
    		label: for(int i=0; i<n; i++){
    			num = scn.nextInt();
    			
    			for(int j=0; j<exceed; j++)
    				if(list[j] == num){
    					scn.nextInt();
    					scn.nextInt();
    					continue label;
    				}
    					
    			if(scn.nextInt() * scn.nextInt() >= 1000000){
    				flag = true;
    				list[++exceed] = num;
    				System.out.println(num);
    			}
    		}
    		
    		if(!flag)
    			System.out.println("NA");
    	}
    }
}