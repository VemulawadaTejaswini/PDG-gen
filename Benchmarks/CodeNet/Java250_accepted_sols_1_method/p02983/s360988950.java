

import java.util.*;
public class Main {
	
	public static void main(String[] args){
		
		Scanner s = new Scanner(System.in);
		long l = s.nextLong() , r = s.nextLong();
		
		long[] arr = new long[2019];
		Arrays.fill(arr, -1);
		
		long i = l;
		
		while( i <= r ){
			
			int rem = (int) (i%2019);
			if(arr[rem] != -1) break;
			arr[rem] = i;
			++i;
			
		}
		
		
		long ans = ((l%2019)*(r%2019))%2019;
		
		for( int i1 = 0;i1 < arr.length;++i1){
			
			for(int j = 0;j < arr.length ;++j){
			
				if(i1 != j){
					if(arr[i1] != -1 && arr[j] != -1){
						long val = ((arr[i1]%2019)*(arr[j]%2019))%2019;
						if(val < ans) ans = val;
						
					}
				}
				
			}
			
		}
		
		System.out.println(ans);
		
		
		
		
	}
	
	
}
