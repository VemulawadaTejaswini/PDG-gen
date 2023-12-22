import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      	int n = sc.nextInt();
      	int m = sc.nextInt();
      	int[] a = new int[n];
      	int sum = 0;
      	for(int i = 0; i < n; i++){
        	a[i] = sc.nextInt();
          	sum += a[i];
        }
      	Arrays.sort(a);
      	double border = (double)sum/4.0/(double)m;      
      	int count = 0;
      	for(int i = n-1; i >= 0; i--){
        	if(a[i] >= border) count++;
          	else break;
        }
      	if(count>=m) System.out.println("Yes");
      	else System.out.println("No");
    }
}