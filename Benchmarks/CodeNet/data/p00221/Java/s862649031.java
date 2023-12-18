import java.util.*;

class Main{
    public static void main(String[] args){
    	Scanner scn = new Scanner(System.in);
    	int m,n;
    	boolean[] players = new boolean[1000];
    	
    	for(m=scn.nextInt(), n=scn.nextInt(); n!=0 || m != 0; m=scn.nextInt(), n=scn.nextInt()){
    		int num = m;
    		boolean flag = false;
    		
    		for(int i=0; i<m; i++)
    			players[i] = true;
    		
    		for(int i=1,id=0; i<=n; i++){
    			String word = scn.next();
    			String correct;
    			
    			if(i%15 == 0){
    				correct = "FizzBuzz";
    			}else if(i%3 == 0){
    				correct = "Fizz";
    			}else if(i%5 == 0){
    				correct = "Buzz";
    			}else{
    				correct = Integer.toString(i);
    			}
    			
    			if(!word.equals(correct)){
    				players[id] = false;
    				
    				if(--num==1){
    					for(i++;i<=n;i++)
    						scn.next();
    					break;	
    				}
    			}
    			
    			while(true){
    				id = (id+1)%m;
    				if(players[id])
    					break;
    			}
    		}
    		
    		for(int i=0;i<m; i++){
    			if(players[i]){
    				if(flag){
    					System.out.print(" "+(i+1));
    				}else{
    					System.out.print(i+1);
    					flag = true;
    				}
    			}
    		}
    			
    		System.out.println();
    	}
    	
    	return;
    }
}