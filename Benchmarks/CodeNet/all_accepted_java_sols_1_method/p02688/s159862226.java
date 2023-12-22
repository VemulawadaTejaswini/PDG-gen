import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      	int n = sc.nextInt();
      	int k = sc.nextInt();
      	int[] have = new int[n];
      	int a, d;
      	for(int i = 0; i < k; i++){
        	d = sc.nextInt();
          	for(int j = 0; j < d; j++){
            	a = sc.nextInt();
              	have[a-1]++;
            }
        }
      	int count = 0;
      	for(int i = 0; i < n; i++){
        	if(have[i] == 0) count++;
        }
      	System.out.println(count++);
    }
}