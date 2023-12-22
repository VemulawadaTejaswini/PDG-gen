import java.util.*;
import java.math.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      	int N = sc.nextInt();
      	BigInteger[] arr = new BigInteger[N];
      	BigInteger res = new BigInteger("0");
      	for (int i = 0; i < N; i++){
        	arr[i] = sc.nextBigInteger();
          	if ((i > 0) && (arr[i].compareTo(arr[i-1]) == -1)){
            	BigInteger x = arr[i-1].subtract(arr[i]);
              	arr[i] = arr[i].add(x);
            	res = res.add(x);
            }
        }
      	
      	System.out.println(res);
    }
}