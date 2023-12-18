import java.util.*;
import java.lang.*;
import java.io.*;

public class Main{
	public static void main (String[] args) throws java.lang.Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
	    Shop shopA = new Shop(200,380,5,20);
	    Shop shopB = new Shop(300,550,4,15);
	    Shop shopC = new Shop(500,850,3,12);
	    
	    HashMap<Integer,Integer> costA = new HashMap<Integer,Integer>();
	    for(int i=0;i<=5000;i+=200){
	        costA.put(i,shopA.calcCost(i));
	    }
	    HashMap<Integer,Integer> costB = new HashMap<Integer,Integer>();
	    for(int i=0;i<=5000;i+=300){
	        costB.put(i,shopB.calcCost(i));
	    }
	    HashMap<Integer,Integer> costC = new HashMap<Integer,Integer>();
	    for(int i=0;i<=5000;i+=500){
	        costC.put(i,shopC.calcCost(i));
	    }
	    Set<Integer> keyA = costA.keySet();
	    Set<Integer> keyB = costB.keySet();
	    Set<Integer> keyC = costC.keySet();
	    int ans = Integer.MAX_VALUE;
	    while(!"0".equals(line)){
	        int n = Integer.parseInt(line);
	        
	        for(int a:keyA)
	        for(int b:keyB)
	        for(int c:keyC){
	            if(n == a+b+c){
	                ans = Math.min(ans,costA.get(a)+costB.get(b)+costC.get(c));
	            }
	        }
	        
	        
	        
	        line = br.readLine();
	        System.out.println(ans);
	        ans = Integer.MAX_VALUE;
	    }
	}
    
    public static class Shop{
        int quantity;
        int cost;
        int unit;
        float discount;
        
        Shop(int q,int c,int u,int d){
            this.quantity = q;
            this.cost = c;
            this.unit = u;
            this.discount = d/100f;
        }
        
        public int calcCost(int q){
            int ans = 0;

            int set = q/(unit*quantity);
            int sin = q%(unit*quantity)/quantity;
            ans += set*unit*cost*(1-discount);
            ans += sin*cost;
            
            return ans;
        }
        
    }
}