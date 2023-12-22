import java.util.*;
 
public class Main{
	public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
      	int k = scan.nextInt();
      	int[] a = new int[k];
      	int ans = 0;
      	for(int i = 0; i < k; i ++){
        	a[i] = scan.nextInt();
        }
      	Arrays.sort(a);
      	int b = k / 2;
      	if(a[b - 1] == a[b]){
        	ans = 0;
        }
      	else{
        	ans = a[b] - a[b-1] ;
        }
      	System.out.print(ans);
    }
 
}