import java.util.*;
 
public class Main{
	public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
      	int n = scan.nextInt();
      	int l = scan.nextInt();
      	int[] arr = new int[n];
      	int sum = 0;
      	int min = 0;
      	for(int i = 0; i<n; i++){
        	arr[i] = l + i ;
          	sum += arr[i];
        }
      if(l >= 0){
        System.out.print(sum - l);
      }
     
      else{
        if(n + l > 0){
      		min = sum;
      		
        }
        else{
        	min = sum - (n + l - 1);
        }
        System.out.print(min);
      }
      	
    }
}