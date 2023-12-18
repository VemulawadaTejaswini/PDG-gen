import java.util.*;

public class Main{
	public static void main(String args[]){
    	Scanner sc = new Scanner(System.in);
      
      	int x = sc.nextInt();
      	int n = sc.nextInt();
      
        int p[] = new int(n);
      
      	for(int i = 0; i < n; i++){
        	p[i] = sc.nextInt();
        }
      
      	if(n == 0){
          System.out.print(x);
          return;
        }
      
      	Arrays.sort(p);
      
      	boolean flg = true;
      	int r = 0;
      	int diff = Integer.MAX_VALUE;
     	for(int i =0; i < n; i++){
          	if(x - p[i] < diff){
            	diff = x - p[i];
                r = p[i];
            }
        }
      	System.out.print(r);
      
    }
}
