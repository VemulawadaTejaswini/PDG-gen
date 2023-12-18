import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
	private static int terminal = 0;
	private static int numConsist = 0;

	public void nextFor(int iteration, List<Integer> array, int constant, int sum){
		int tmpSum;
		for( int i = 0; i <array.size(); i++){
			tmpSum = new Integer(sum);
			List<Integer> tmpArray = new ArrayList<Integer>(array);
			tmpSum += tmpArray.get(i) * (constant + 1);
			tmpArray.remove(i);
			if (tmpArray.size() != 0 && iteration > 1)
				nextFor(iteration -1, tmpArray, constant + 1, tmpSum);
			if((iteration == 1 && tmpSum == terminal) || (tmpArray.size() == 0 && tmpSum == terminal)){
				numConsist++;
			}
		}
	}

	public static void main(String[] args){

		Main cNS = new Main();
		List<Integer> array = new ArrayList<Integer>();
		for(int i = 0; i < 10; i++){
			array.add(i);
		}

		Scanner input = new Scanner(System.in);
		while(input.hasNext()){
			String[] paraSet = input.nextLine().split(" ");
			int iteration = Integer.parseInt(paraSet[0]);
			terminal = Integer.parseInt(paraSet[1]);
            numConsist = 0;
			cNS.nextFor(iteration, array, 0, 0);
			System.out.println(numConsist);
		}
		input.close();
	}
}