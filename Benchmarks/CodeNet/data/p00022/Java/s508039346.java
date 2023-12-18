
import java.util.ArrayList;
import java.util.Scanner;

public class Main {	
	public static void main(String[] args) {
		ArrayList<Long> maxSums = new ArrayList<Long>();
		Scanner sc = new Scanner(System.in);
		while(true){
			//üÍ³êéñÌvfðó¯æé
			int numNumbers = sc.nextInt();
			if(numNumbers == 0){
				sc.close();
				break;
			}
			long[] sequence = new long[numNumbers];
			//üÍ³ê½vf¾¯vfðó¯æé
			for(int i = 0; i < numNumbers; i++){
				sequence[i] = sc.nextInt();
			}
			//1ZbgÌüÍÉÎ·éÌaÌÅålðÊXgÉÇÁ·é	
			maxSums.add(getMaxSumSequence(sequence, numNumbers));
		}
		
		//eüÍZbgÉÎ·éÌaÌÅålðoÍ·é
		for(int i = 0; i < maxSums.size(); i++){
			System.out.println(maxSums.get(i));
		}
	}
	
	public static long getMaxSumSequence(long[] sequence, int numNumbers){
		long maxSum = 0;
		int pointerLeft = 0;
		int lastIndex = numNumbers - 1;
		int pointerRight = lastIndex;
		long tmp;
		while(pointerLeft <= lastIndex){
			for(pointerRight = lastIndex; pointerLeft < pointerRight; pointerRight--){
				tmp = getSum(sequence, pointerLeft, pointerRight);
				if(maxSum < tmp){
					maxSum = tmp;
				}
			}
			pointerLeft++;
			tmp = 0;
		}
		return maxSum;
	}
	
	private static long getSum(long[] sequence, int left, int right){
		long tmp = 0;
		for(int i = left; i <= right; i++){
			tmp += sequence[i];
		}
		return tmp;
	}
}