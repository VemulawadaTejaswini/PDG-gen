import java.util.*;
 
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()){
        	int[] a = new int[8];
        	int b = 0;
        	int c = 0;
        	for(int i = 0; i < a.length; i++)
        		a[i] = sc.nextInt();
        	
        	for(int i = 0; i < a.length/2; i++){
        		for(int u = 0; u < a.length/2; u++){
        			if(a[i] == a[u+4] && i == u)
        				b++;
        			else if(a[i] == a[u+4])
        				c++;
        		}
        	}
        	System.out.println(b + " " + c);
        }
    }
}