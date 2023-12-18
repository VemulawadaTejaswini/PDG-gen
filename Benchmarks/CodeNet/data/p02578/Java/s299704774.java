import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
      	int[] a = new int[n];
      	for(int i = 0; i < n; i++){
        	a[i] = sc.nextInt();
        }
      
      	long sum = 0;
      	int dis;

      	for(int i = 0; i < n-1; i++){
        	if(a[i] > a[i+1]){
            	dis = a[i] - a[i+1];
              	sum += dis;
              	a[i+1] += dis;
            }
        }
      
      	System.out.println(sum);
    }
}