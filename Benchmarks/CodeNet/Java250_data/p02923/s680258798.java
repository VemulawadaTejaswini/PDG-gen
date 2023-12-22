import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] h = new long[n];
		for(int i = 0; i < n; i++){
			h[i] = sc.nextLong();
		}
		long max = 0,count = 0;
		for(int i = 0; i < n-1; i++){
			
			if(h[i] >= h[i+1]){
				count += 1;
			}else{
				count = 0;
			}
			if(max < count){
				max = count;
			}
		}
		System.out.println(max);
	}
	
	}