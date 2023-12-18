import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	static int N,M,MIN;
	static int[] candles;
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		long startTime = new Date().getTime();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.valueOf(st.nextToken());
		M = Integer.valueOf(st.nextToken());
		
		candles = new int[N+1];
		
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			int zb =  Integer.valueOf(st.nextToken());
			candles[i] = zb;
			
			if(i<M-1) {
				continue;
			}
			int right = candles[i];
			int left = candles[i-M+1];
			
			int total  = right - left;
//			System.out.println("right:"+right+" left:"+left);
//			System.out.println("total1:"+total);
			if(left>=0) {//left都大于0
				total += left;
			}else if(right<=0) {//right小于0
				total += Math.abs(right);
			}else {//跨越0点
				
//				System.out.println("left:"+left+" right:"+right);
				total += Math.abs(left)>right?right:Math.abs(left);
			}
//			System.out.println("total2:"+total);
			if(MIN==0) {
				MIN = total;
			}else {
				if(total<MIN) {
					MIN = total;
				}
			}
		} 
		
		
//		long endTime = new Date().getTime();
//		System.out.println((endTime-startTime)/1000);
		System.out.println(MIN);
		
	}
	
}
