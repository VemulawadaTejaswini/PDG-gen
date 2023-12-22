import java.util.*;
 
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      	int n = sc.nextInt();
      	String[] spi = new String[n];
      	int list = 0;
      	int[] v = new int[n];
      	int[] cost = new int[n];
      	for(int i = 0; i < n ; i ++){
        	v[i] = sc.nextInt();
        }
      	for(int i = 0; i < n ; i ++){
        	cost[i] = sc.nextInt();
        }
      	for(int i = 0; i < n; i ++){
          	spi[i] = v[i] + "_" + cost[i];
          	list += v[i] - cost[i];
        }
      	Arrays.sort(spi);
      	for(String s : spi){
          	int value = Integer.parseInt(s.split("_")[0]);
          	int c = Integer.parseInt(s.split("_")[1]);
        	list = Math.max(list, list - value + c);
        }
      	System.out.print(list);
      	
    }
}