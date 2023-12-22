import java.util.*;

class Main {
	public static void main(String args[]){
	
    Scanner scan = new Scanner(System.in);
    int N=scan. nextInt();
    int T=scan.nextInt();
    
 
    
    int time[]=new int[N];
    int cost[]= new int[N];
    
    for(int i=0;i<N;i++){
    	cost[i]=scan.nextInt();
    	time[i]=scan.nextInt();
    }
    
    int mincost=1001;
   
  
    	for(int i=0;i<N;i++){
    		if(time[i]<=T){
    		  if(cost[i]<mincost){
    			  mincost=cost[i];
    		  }
    		}
    	}
    		if(mincost==1001){
    			System.out.println("TLE");
    		}else{
    			System.out.println(mincost);
    		}
    		
         }
    	
	
}
