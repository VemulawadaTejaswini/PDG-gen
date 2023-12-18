import java.util.*;

public class Main{
	public static void main(String[] args){
    	int n = Integer.parseInt(sc.next());
      	int k = Integer.parseInt(sc.next());
      	int[] list = new int[n];
      	long first = 0L;
      	long save = 0L;
      	for(int cnt = 0;cnt < n;cnt++){
        	list[cnt] = Integer.parseInt(sc.next());
        }
      	for(int cnt = 0;cnt < k;cnt++){
        	first *= list[cnt];
        }
      	for(int cnt = 0;cnt < n - k;cnt++){
        	for(int i = cnt + 1;i < n - k;i++){
            	save *= list[cnt];
            }
          	if(first < save){
            	System.out.println("Yes");
            }else{
            	System.out.println("No");
            }
          	first = save;
          	save = 0L;
        }
    }
}