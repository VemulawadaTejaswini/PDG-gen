import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{

	private static int[] x;
	private static int[] top = {0,0,0};
	
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		x = new int[10];
		for(int i=0;i<10;i++){
			x[i] = Integer.parseInt(br.readLine());
			
			if(x[i] > top[0]){
				top[2] = top[1];
				top[1] = top[0];
				top[0] = x[i];
			}
			else if(x[i] > top[1]){
				top[2] = top[1];
				top[1] = x[i];
			}
			else if(x[i] > top[2]){
				top[2] = x[i];
			}
		}
		System.out.println(top[0]);
		System.out.println(top[1]);
		System.out.println(top[2]);
	}
}