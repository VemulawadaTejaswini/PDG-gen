import java.util.*;

public class Main{
	public static void main(String args[]){
    	Scanner sc = new Scanner(System.in);
      
      	int x = sc.nextInt();
      	int n = sc.nextInt();
      
        Integer p[] = new int[n];
      
      	for(int i = 0; i < n; i++){
        	p[i] = sc.nextInt();
        }
      
      	if(n == 0){
          System.out.print(x);
          return;
        }
      
      	List<Integer> list = Arrays.asList(p);
      
      	int r = 0;
     	for(int i =0; i < 100; i++){
          	r = x - i;
          
          	if(!p.contains(r)){
            	System.out.print(r);
              return;
            }
          
          	r = x + i;
          
          	if(!p.contains(r)){
            	System.out.print(r);
              return;
            }
          
        }
      
    }
}
