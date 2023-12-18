import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		while(true){
			int sum=0, n = Integer.parseInt(in.readLine());
			if(n==0){
				break;
			}
			int[] s = new int[n];
			String[] nums = in.readLine().split(" ");
			for(int i=0; i<n; i++){
				s[i] = Integer.parseInt(nums[i]);
				sum += s[i];
			}
			double aveM = (double)sum/n;
			double process=0;
			for(int si : s){
				process += (double)(Math.pow(si-aveM, 2));
			}
			double dev = (double) Math.sqrt(process/n);
			System.out.println(dev);
		}
	}
}