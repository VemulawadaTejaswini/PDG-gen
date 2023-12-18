import java.io.*;
import java.util.*;
public class Main{
	public static void main(String[] args)throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//Scanner sc = new Scanner(System.in);
		String str[] =br.readLine().split(" ");
		int n =  Integer.parseInt(str[0]);
		int p =  Integer.parseInt(str[1]);
		int A[] = new int[n];
		int even = 0 , odd ;
		str = br.readLine().split(" ");
		for(int i = 0 ; i< n ; i++){
			A[i] = Integer.parseInt(str[i]);
			if (A[i] % 2 == 0) even++;
		}
		odd = n - even ;
		long ans = 1;
		if(odd == 0){
			ans <<= n;
			if(p == 1) ans = 0;
		}else{
			ans <<= n-1;
		}
		System.out.println(ans);
	}
}