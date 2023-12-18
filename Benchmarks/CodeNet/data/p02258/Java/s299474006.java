import java.util.Scanner;
public class Main{
    static int dmin = -1000000000;
     
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0; i < n; i++){
            nums[i] = sc.nextInt();
        }
         
        int max = dmin;
        int min=1;
        int p=0;
        
        while(true){
        	p = max_point(p,nums);
        	if(p == -1) {
        		break;
        	}else if(p == 0){
        		p++;
        	}else{
        		min = min_point(p,nums);
        	}	
        	
        	if(max < nums[p] - nums[min]) max = nums[p]-nums[min];
        }
        
        System.out.println(max);
    }
    
    static int max_point(int n,int[] a){
    	int p;
    	if(n == 0){ 
    		p = n;
    	}else{
    		p = n+1;
    	}
    	
    	if(p == a.length) return -1;
    	int mp = p;
    	
    	for(int i=p; i < a.length; i++){
    		if(a[mp] < a[i]) mp = i;
    	}
    	return mp;
    }
    
    static int min_point(int n,int[] a){
    	int mp = n;
    	if(n == a.length) return -1;
    	
    	for(int i=n; i >= 0; i--){
    		if(a[mp] > a[i]) mp = i;
    	}
    	return mp;
    }
}