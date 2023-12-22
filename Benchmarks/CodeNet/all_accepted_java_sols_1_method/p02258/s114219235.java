import java.util.*;
public class Main {
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	int n=sc.nextInt();
    	int[] ary =new int[n];
    	int i,m;
    	int reg=0;
    	int min=0;
    	int max=0;
    	for(i=0;i<n;i++){
    		m=sc.nextInt();
    		if(i==0){
    			min=m;
    		}
    		if(i==1){
    			max=m-min;
    		}
        
    		if(m-min>max){
    			max=m-min;
    		}
    		if(m<min){
    			min=m;
    		}
    		
    	}
    	System.out.println(max);

    }
}
