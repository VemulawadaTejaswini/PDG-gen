import java.util.*;
public class Main {
	public static void main(String[] args){
      
		Scanner sc = new Scanner(System.in);
      
        int n = sc.nextInt();
        int x = sc.nextInt();
      
        int[] bound = new int[n];
        int[] d = new int[n+1];
      
        int count = 0;
      
        for(int cr=0; cr<n; cr++){
            bound[cr] = sc.nextInt();
        }
      
        d[0]= 0;
      
        for(int cr=1; cr<n+1; cr++){
            d[cr] = d[cr-1] + bound[cr-1];
        }
      
       for(int num:d){
         if(num <= x){
           count++;
         }
       }
       System.out.println(count);        
	}
}
