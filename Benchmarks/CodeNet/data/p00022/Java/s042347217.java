import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws IOException {
		// TODO ?????????????????????????????????????????????
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true){
			int n = Integer.parseInt(br.readLine());
			
			if(n == 0){
				break;
			}
			
			long sum = 0;
			
			ArrayList<Long> positive = new ArrayList<Long>();
			ArrayList<Long> negative = new ArrayList<Long>();
			int mode = 0; //1 positive 0 negative
			boolean firstPositive = false;
			long maxUnder0 = Long.MIN_VALUE;
			for(int i = 0; i < n; i++){
				long input = Long.parseLong(br.readLine());
				if(!firstPositive && input <= 0){
					if(maxUnder0 < input){
						maxUnder0 = input;
					}
					continue;
				}
				else if(!firstPositive && input > 0){
					firstPositive = true;
				}
				
				if(mode == 0){
					if(input > 0){
						mode = 1;
						positive.add(input);
					}
					else{
						negative.set(negative.size() - 1, negative.get(negative.size() - 1) + input);
					}
				}
				else if(mode == 1){
					if(input < 0){
						mode = 0;
						negative.add(input);
					}
					else{
						positive.set(positive.size() - 1, positive.get(positive.size() - 1) + input);
					}
				}
			}
			
			long[] tmpSum = new long[positive.size()];
			
			if(positive.size() == 0){				
				System.out.println(maxUnder0);
				continue;
			}
			
			tmpSum[0] = positive.get(0);
			for(int i = 1; i < positive.size() ;i++){
				tmpSum[i] = positive.get(i)+negative.get(i-1)+tmpSum[i-1];
			}
			
			int maxIndex = 0;
			for(int i = 1; i < tmpSum.length ; i++){
				if(tmpSum[i] > tmpSum[maxIndex]){
					maxIndex = i;
				}
			}
			System.out.println(tmpSum[maxIndex]);
		}
	}
}