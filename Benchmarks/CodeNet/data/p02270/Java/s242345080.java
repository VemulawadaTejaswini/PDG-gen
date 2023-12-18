import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static int arraymin = -1;

	public static void main(String[] args) throws IOException {
		// TODO ?????????????????????????????????????????????
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] strArray = br.readLine().split(" ");
		int numOfBag = Integer.parseInt(strArray[0]);
		int numOfTruck = Integer.parseInt(strArray[1]);

		int[] weight = new int[numOfBag];
		//int sumOfWeight = 0;
		for(int i = 0; i < numOfBag ; i++){
			weight[i] = Integer.parseInt(br.readLine());
		//	sumOfWeight++;
		}

		//int capacity;

		System.out.println(calcMinimumCapacity(weight, numOfTruck));


	}



	private static int calcMinimumCapacity(int[] weight, int numOfTruck) {
		// TODO ?????????????????????????????????????????????
		int result = 0;
		int sum = sumOfArray(weight);

		for(int i = 1; i <= sum; i++){
			if(isEnough(weight, numOfTruck, i)){
				return i;
			}
		}

		return result;
	}



	private static int sumOfArray(int[] weight) {
		// TODO ?????????????????????????????????????????????
		int sum = 0;
		for(int i = 0; i < weight.length ; i++){
			sum += weight[i];
		}

		return sum;
	}



	static boolean isEnough(int[] weight, int truckNum, int capacity){
		int currentTruckWeight = 0;
		int currentTruck = 1;
		for(int i = 0; i < weight.length ; i++){
			if(weight[i] > capacity){
				return false;
			}
			currentTruckWeight += weight[i];
			if(currentTruckWeight > capacity){
				currentTruckWeight = weight[i];
				currentTruck++;
				if(currentTruck > truckNum){
					return false;
				}
			}
		}
		return true;
	}

	static int min(int [] weight){

		if(arraymin > 0){
			return arraymin;
		}

		arraymin = weight[0];

		for(int i = 1; i < weight.length ; i++){
			if(arraymin > weight[i]){
				arraymin = weight[i];
			}
		}

		return arraymin;
	}

}