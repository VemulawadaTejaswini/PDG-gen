import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      	int n = sc.nextInt();
      	long[] a = new long[n];
      	int zero = 0;
      	long max = (long)Math.pow(10, 18);
      
      	for(int i = 0; i < n; i++){
        	a[i] = sc.nextLong();
          	if(a[i]==0) zero++;
        }
      	if(zero > 0){
        	System.out.println(-1);
        }else{
          	long prod = 1;
        	for(int i = 0; i < n; i++){
            	if(a[i] > max/prod){
                	prod = -1;
                    break;
                }else{
                	prod *= a[i];
                }
            }
          	System.out.println(prod);
        }
    }
}
