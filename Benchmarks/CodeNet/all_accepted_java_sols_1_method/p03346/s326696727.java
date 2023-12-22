
import java.util.*;
	public class Main{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            //入力
            int n = Integer.parseInt(sc.next()), temp, max = 1, maxtmp = 0;
            int[] num = new int[n];
            
            for(int i=0; i<n; i++){
            	temp = Integer.parseInt(sc.next());
            	num[temp-1] = i;
            }
            
            temp = num[0];
            
            for(int i=1; i<n; i++){
            	maxtmp = 1;
            	while(i < n && temp < num[i]){
            		maxtmp++;
            		temp = num[i];
            		i++;
            	}
            	if(i < n){
            		temp = num[i];        		
            	}
            	
            	if(max < maxtmp){
            		max = maxtmp;
            	}
            }
            
            System.out.println(n - max);     
            sc.close();
        }
    }
	