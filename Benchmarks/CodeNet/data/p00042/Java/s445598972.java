
import java.util.*;
public class Main {

	public void doIt(){
		Scanner sc = new Scanner(System.in);
		int count = 1;
		while(true){
			int w = sc.nextInt();
			if(w == 0)
				break;
			int [] dp = new int[w];
			int n = sc.nextInt();
			int [][] data = new int[n][2];
			for(int i=0; i < n; i++){
				String [] input = sc.next().split(",");
				data[i][0] = Integer.parseInt(input[0]);
				data[i][1] = Integer.parseInt(input[1]);
			}

			int max = 0;
			int maxIdx = 0;
			for(int i=0; i < w; i++){
				for(int j=0;j < n; j++){
					int index = i - data[j][1];
					if(index < 0){
						continue;
					}
					if(index == 0 || dp[index] > 0){
						int result = dp[index] + data[j][0];
						if(dp[i] < result)
							dp[i] = result;
					}

				}
				if(dp[i] > 0){
					maxIdx = i;
				}
			}
			System.out.println("Case " + count++ + ":");
			System.out.println(dp[49]);
			System.out.println(maxIdx);
		}


	}
	public static void main(String[] args) {
		Main obj = new Main();
		obj.doIt();

	}

}