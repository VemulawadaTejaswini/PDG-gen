import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
	private static int terminal = 0;
	private static int numConsist = 0;

	public void nextFor(int iteration, List<Integer> array, int sum){
		int tmpSum;
		for( int i = 0; i < array.size(); i++){
			tmpSum = new Integer(sum);
			List<Integer> tmpArray = new ArrayList<Integer>(array);
			tmpSum += tmpArray.get(i);
			
			if(iteration > 1 && tmpSum >= terminal)	continue;
			
			for(int iDel = 0; iDel <= i; iDel++)	tmpArray.remove(0);
			if (tmpArray.size() != 0 && iteration > 1)
				nextFor(iteration - 1, tmpArray, tmpSum);
			if(iteration == 1 && tmpSum == terminal){
				numConsist++;
				break;
			}
		}
	}

	public static void main(String[] args){

	    Main cNS = new Main();
		List<Integer> array = new ArrayList<Integer>();
		for(int i = 0; i < 100; i++){
			array.add(i);
		}

		Scanner input = new Scanner(System.in);
		int num = 0;
		while(input.hasNext() && num < 50){
			String[] paraSet = input.nextLine().split(" ");
			int iteration = Integer.parseInt(paraSet[0]);
			terminal = Integer.parseInt(paraSet[1]);
			if(iteration == 0 && terminal == 0)	break;
			if(iteration < 1 || iteration > 9 || terminal < 0 || terminal > 1000)	continue;
			numConsist = 0;

			cNS.nextFor(iteration, array, 0);
			System.out.println(numConsist);
			num++;
		}
		input.close();
	}
}