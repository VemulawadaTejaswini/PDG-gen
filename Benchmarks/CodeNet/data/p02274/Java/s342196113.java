import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Main {
   public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] A = new int[n];
		
		long cnt;
		
		String[] str = br.readLine().split(" ");
		
		for(int i = 0; i < n; i++){
			A[i] = Integer.parseInt(str[i]);
		}
		
		cnt = Recursion(A);
		
		System.out.println(cnt);
	}
	
	static long Recursion(int data[]){
		long c = 0;
		
		for(int i = 0; i < data.length - 1; i++){
			for(int j = 1; j < data.length - i; j++){
				if(data[i] > data[i + j]){
					c++;
				}
			}
		}
		
		return c;
	}
}