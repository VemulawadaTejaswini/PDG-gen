import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		// TODO ?????????????????????????????????????????????
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while(true){
			int n = Integer.parseInt(br.readLine());

			if(n == 0){
				break;
			}
			
			long[] input = new long[n];
			for(int i = 0; i < n; i++){
				input[i] = Long.parseLong(br.readLine());
			}
			
			SubArray subArray = new SubArray(input, 0, input.length - 1);
			
			System.out.println(MaxSubarray2(subArray));
			/*
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

			long[] tmpSum = new long[positive.size()*positive.size()];
			Arrays.fill(tmpSum, 0);

			if(positive.size() == 0){
				System.out.println(maxUnder0);
				continue;
			}

			tmpSum[0] = positive.get(0);
			for(int i = 0; i < positive.size() ;i++){
				for(int j = i; j < positive.size() ; j++){
					tmpSum[i*positive.size() + j] = positive.get(j);
					if(j != i) {
						tmpSum[i*positive.size() + j] += negative.get(j-1)+tmpSum[j-1];
					}
				}
			}

			int maxIndex = 0;
			for(int i = 1; i < tmpSum.length ; i++){
				if(tmpSum[i] > tmpSum[maxIndex]){
					maxIndex = i;
				}
			}
			System.out.println(tmpSum[maxIndex]);
			*/
		}
	}
	
	static long MaxSubarray1 (SubArray input){
		int left = input.left;
		int right = input.right;
		long maxSum = input.array[input.left];
		
		for(int i = input.left ; i <= input.right ; i++){
			for(int j = i; j <= input.right; j++){
				int sum = 0;
				
				for(int k = i; k <= j; k++){
					sum += input.array[k];
				}
				
				if(maxSum < sum){
					left = i;
					right = j;
					maxSum = sum;
				}
			}
		}
		
		input.left = left;
		input.right = right;
		
		return maxSum;
	}
	
	static long MaxSubarray2(SubArray input){
		int left = input.left;
		int right = input.right;
		long maxSum = input.array[input.left];
		
		for(int i = input.left ; i <= input.right ;i++){
			int sum = 0;
			
			for(int j = i; j <= input.right; j++){
				sum += input.array[j];
				
				if(maxSum < sum){
					left = i;
					right = j;
					maxSum = sum;
				}
			}
		}
		
		input.left = left;
		input.right = right;
		
		return maxSum;
	}
}

class SubArray {
	long[] array;
	int left;
	int right;
	
	public SubArray (long[] array, int left, int right){
		this.array = array;
		this.left = left;
		this.right = right;
	}
}