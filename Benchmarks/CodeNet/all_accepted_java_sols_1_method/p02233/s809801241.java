import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main{
	public static void main(String[] args)throws Exception{
		BufferedReader br = 
			new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] fn = new int[n+1];
		fn[0] = 1;
		fn[1] = 1;

		if(n == 0 || n == 1){
			System.out.println(1);
		}else{
			for(int i = 2; i <= n; i++){
				fn[i] = fn[i-1] + fn[i-2];
			}
			System.out.println(fn[n]);
		}
	}
}