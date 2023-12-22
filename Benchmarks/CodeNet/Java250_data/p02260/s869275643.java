import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int count = scanner.nextInt();
		int[] sortList = new int[count];
		for(int i = 0; i < count; i++){
			sortList[i] = scanner.nextInt();
		}
		int changeCount = selectionSort(sortList, count);
		for(int i = 0; i < count; i++){
			if(i != count - 1){
				System.out.print(sortList[i] + " ");
			}else{
				System.out.println(sortList[i]);
			}
		}
		System.out.println(changeCount);
	}

	private static int selectionSort(int[] sortList, int count){
		int swCount = 0;
		int min;
		int temp;
		for(int i = 0; i < count - 1; i++){
			min = i;
			for(int j = i; j < count; j++){
				if(sortList[j] < sortList[min]){
					min = j;
				}
			}
			temp = sortList[i];
			sortList[i] = sortList[min];
			sortList[min] = temp;
			if(min != i){
				swCount++;
			}
		}
		return swCount;
	}
}