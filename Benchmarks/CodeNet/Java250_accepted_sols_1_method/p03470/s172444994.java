import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc  = new Scanner(System.in);
      	int n = sc.nextInt();
      	int[] d = new int[n];
      	int[] mochi = new int[101];
      	for(int i = 0 ; i < n; i++){
        	d[i] = sc.nextInt();
          	mochi[d[i]]++;
        }
      	int count = 0;
      	for(int i = 0; i <= 100; i++){
        	if(mochi[i] > 0) count++;
        }
      	System.out.println(count);
    }
}