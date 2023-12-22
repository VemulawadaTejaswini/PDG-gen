
import java.util.Scanner;
public class Main{
       public static void main(String[] args){
       int i;
    	int[] height = new int[10];
        Scanner scan = new Scanner(System.in);
        for(i = 0;i < 10;i++){
        height[i] = scan.nextInt();
        }
        
        int st = 0,nd = 0 ,rd = 0;
        
        
        	for(i = 0;i < 10;i++){
        		if(height[i]>=st){
        		rd = nd;
        		nd = st;
        		st = height[i];
        		}else if(height[i]>=nd){
        		rd = nd ;
        		nd = height[i];
        		}else if(height[i]>=rd){
        		rd = height[i];
        		
        		}
        	}
        	System.out.println(st);
        	System.out.println(nd);
        	System.out.println(rd);
       		}
}