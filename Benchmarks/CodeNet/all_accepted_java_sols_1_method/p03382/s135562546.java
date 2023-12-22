import java.util.*;

public class Main{
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] num = new int[n];
        int max = 0, index = 0, hindex = 0, diff = 1000000000;
        double half;
        
        for(int i=0; i<n; i++){
        	num[i] = Integer.parseInt(sc.next());
        	if(max < num[i]){
        		max = num[i];
        		index = i;
        	}
        }
        
        half = max/2.0;
        
        for(int i=0; i<n; i++){
        	if(Math.abs(half - num[i]) < diff && index != i){
        		diff = (int)Math.abs(half - num[i]);
        		hindex = i;
        	}
        }
        
        System.out.println(max + " " + num[hindex]);
        sc.close();
    }
}
	
	