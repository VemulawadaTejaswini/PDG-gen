import java.util.*;

class Main{
    public static void main(String[] args){
    	Scanner scn = new Scanner(System.in);
    	int n;
    	int[] id = new int[4000];
    	long[] score = new long[4000];
    	
    	for(n=scn.nextInt(); n!=0; n=scn.nextInt()){
    		boolean flag1 = true;
    		int num=0;
    		
    		for(int i=0; i<n; i++){
    			boolean flag2 = true;
    			int tmp;
    			long sales;
    			
    			tmp = scn.nextInt();
    			sales = scn.nextLong()*scn.nextLong();

    			for(int j=0; j<num; j++)
    				if(id[j] == tmp){
    					score[j] += sales;
    					flag2 = false;
    				}
    			
    			if(flag2){
    				id[num] = tmp;
    				score[num++] = sales;
    			}
    		}
    		
    		for(int i=0; i<num; i++)
    			if(score[i] >= 1000000){
    				flag1 = false;
    				System.out.println(id[i]);
    			}
    		
    		if(flag1)
    			System.out.println("NA");
    		
    		
    	}
    }
}