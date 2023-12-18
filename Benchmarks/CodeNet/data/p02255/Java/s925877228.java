import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int length = input.nextInt();
		input.nextLine();
		String list = input.nextLine();
		int[] intList = new int[length];
		int k = 0;
		for(int i = 0; i < list.length(); i++) {
			if(!list.substring(i, i+1).equals(" ")){
				intList[k] = Integer.parseInt(list.substring(i, i + 1));
				k++;
			}
		}
		for(int i = 1; i < intList.length; i++) {
			for(int m = 0; m < intList.length; m++) {
				System.out.print(intList[m] + " ");
			}
			System.out.println("");
			int key = intList[i];
			int j = i - 1;
			while(j >= 0 && intList[j] > key) {
				intList[j+1] = intList[j];
				j--;
			}
			intList[j+1] = key;
		}
	}
}
