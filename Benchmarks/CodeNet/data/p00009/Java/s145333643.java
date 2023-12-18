import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int count = 0, MAX = 1000000;
		int[] pTable = new int[MAX],sieve = new int[MAX];
		
		pTable[count++] = 2;
		for(int i = 3; i < MAX; i+= 2) {
			if(sieve[i] == 0) {
				pTable[count++] = i;
				for(int j = i * 2; j < MAX; j+= i) sieve[j] = 1;
			}
		}
		
		while(scan.hasNext()) {
			System.out.println(binarySearch(pTable,scan.nextInt(),count - 1));
		}
	}

	static int binarySearch(int[] pTable, int target, int high){
		int low = 0;
		if(pTable[high] < target ){
			return high + 1;
		}
		while(true){
			int axis  = (high + low)/ 2;
			if(target == pTable[high]) {
				return high + 1;
			} else if(pTable[high - 1] < target & target < pTable[high]) {
				break;
			}
			if(pTable[axis] < target) low = axis;
			else high = axis;
		}
		return high ;
	}
}