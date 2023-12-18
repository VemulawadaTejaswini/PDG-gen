
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	private static final int MAX_NUM_INPUTS = 5000;
	private static Scanner sc = new Scanner(System.in);
	private static ArrayList<Integer> sequence = new ArrayList<Integer>(MAX_NUM_INPUTS);
	private static ArrayList<Long> maxSums = new ArrayList<Long>();
	
	public static void main(String[] args) {
		while(true){
			int numNumbers = sc.nextInt();
			if(numNumbers == 0){
				break;
			}
			for(int i = 0; i < numNumbers; i++){
				sequence.add(sc.nextInt());
			}
			maxSums.add(getMaxSumSequence(sequence));
			sequence.clear();
		}
		
		for(int i = 0; i < maxSums.size(); i++){
			System.out.println(maxSums.get(i));
		}
	}
	
	public static long getMaxSumSequence(ArrayList<Integer> sequence){
		long maxSum = 0;
		int pointerRight = sequence.size() - 1;
		while(0 <= pointerRight){
			for(int i = 0; i < pointerRight + 1; i++){
				long tmp = 0;
				for(int j = i; j < pointerRight + 1; j++){
					tmp += sequence.get(j);
				}
				if(maxSum < tmp){
					maxSum = tmp;
				}
			}
			pointerRight--;
		}
		
		return maxSum;
	}
}