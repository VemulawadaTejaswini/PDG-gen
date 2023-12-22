import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		try(BufferedReader bf = new BufferedReader(new InputStreamReader(System.in))){
			int max = 100010;
			//探索用配列
			int[] target = new int[max];
			Arrays.fill(target, 1);
			target[0] = 0;
			target[1] = 0;

			int sqrt = (int)Math.sqrt(target.length);
			for(int i=2; i<=sqrt; i++) {
				int firstNum = i;
				if (target[i] == 1) {
					for (int j=i*firstNum; j<target.length; j+=firstNum) {
						target[j] = 0;
					}
				}
			}
			int[] a = new int[max];
			for (int i=2; i<target.length; i++) {
				if(i%2==0) continue;
		        if (target[i]==1 && target[(i+1)/2]==1) {
		            a[i] = 1;
		        }
		    }
			//累積和
			int[] sum = new int[max+1];
			for(int i = 0;i < max;i++) {
				sum[i+1] = sum[i] + a[i];
			}
			//Query処理
			int Q = Integer.parseInt(bf.readLine());
			for(int q = 0;q < Q;q++) {
				String[] s = bf.readLine().split(" ");
				int l = Integer.parseInt(s[0]);
				int r = Integer.parseInt(s[1])+1;
				System.out.println(sum[r] - sum[l]);
			}
		}catch(IOException ioe) {
			ioe.getMessage();
		}
	}
}