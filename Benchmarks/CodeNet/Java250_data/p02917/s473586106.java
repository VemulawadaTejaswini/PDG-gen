import java.util.*;
public class Main{
	public static void main(String[] s){
    maxi();
    }
  	public static void maxi(){
    	Scanner s = new Scanner(System.in);
    	int sum = 0;
    	int n = s.nextInt();
    	int[] bs = new int[n -1];
    	for (int i = 0; i < n - 1; i++){
    		bs[i] = s.nextInt();
		}

    	
		sum += bs[0] + bs[n - 2];
    	for (int i = 0; i < n - 2; i++)
    		sum += (int) Math.min(bs[i],bs[i+1]);

    	System.out.println(sum);
	}
  
}