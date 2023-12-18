import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
    	int c=0;
    	for(int k=1;k<=n;k++){
        	for(int i=1;i<=(n-k);i++){
        		for(int j=1;j<=(n-k);j++){
        			if(i == (n-k)/j) 
        				c++;
        		}
        	}	
        }
        System.out.println(c);
    }
}