import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
	private static int terminal = 0;
	private static int numConsist = 0;

	public void nextFor(int iteration, List<Integer> integerList, int constant, int sum){
		int tmpSum;
		for( int i = 0; i <integerList.size(); i++){
			tmpSum = new Integer(sum);
			List<Integer> tmpIntegerList = integerList;//new ArrayList<Integer>(integerList);
			tmpSum += tmpIntegerList.get(i) * (constant + 1);
			tmpIntegerList.remove(i);
			if(tmpSum > terminal){
				i = integerList.size();
			} else {
				if (tmpIntegerList.size() != 0 && iteration > 1)
					nextFor(iteration -1, tmpIntegerList, constant + 1, tmpSum);
				if((iteration == 1 && tmpSum == terminal) || (tmpIntegerList.size() == 0 && tmpSum == terminal)){
					numConsist++;
				}
			}
		}
	}

	public static void main(String[] args){

		Main cNS = new Main();
		List<Integer> integerList = new ArrayList<Integer>();
		for(int i = 0; i < 10; i++){
			integerList.add(i);
		}

		Scanner input = new Scanner(System.in);
		while(input.hasNext()){
			int iteration = input.nextInt();
			terminal = input.nextInt();

			if(iteration >= 1 && iteration <=10 && terminal >= 0 && terminal <= 330){
				numConsist = 0;
				cNS.nextFor(iteration, integerList, 0, 0);
				System.out.println(numConsist);
			} else if(iteration >= 1 && iteration <=10 && terminal > 330 && terminal <= 10000){
				System.out.println(0);
			}

		}
		input.close();
	}
}