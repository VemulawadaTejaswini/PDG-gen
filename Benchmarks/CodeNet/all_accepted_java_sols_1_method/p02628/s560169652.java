import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      	int n = sc.nextInt();
      	int k = sc.nextInt();
      	int[] pi = new int[n];
      	int sum = 0;
      	for(int i = 0; i < n; i++){
        	pi[i] = sc.nextInt();
        }
		Arrays.sort(pi);
      	for(int i = 0; i < k; i++){
        	sum += pi[i];
        }
      
      	System.out.println(sum);
    }
}