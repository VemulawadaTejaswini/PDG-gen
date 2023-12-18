import java.util.Scanner;

public class Main {
	
	public static int maxProfitWhenSell(int[] arr, int maxP, int index, int min) {
		if(index == arr.length - 1) {
			return Math.max(maxP, arr[index] - min);
		}else {
			maxP = Math.max(maxP, arr[index] - min);
			min = Math.min(min, arr[index]);
			return Math.max(maxP, maxProfitWhenSell(arr, maxP, index + 1, min));
		}
		
	}
	public static int maxProfit(int[] arr) {
		int maxP = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for (int index = 0; index < arr.length; index += 1) {
			maxP = Math.max(maxP, arr[index] - min);
			min = Math.min(min, arr[index]);
		}
		return maxP;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int line = Integer.parseInt(sc.nextLine());
		int[] rt = new int[line];
		for (int li = 0; li < line; li += 1) {
			rt[li] = Integer.parseInt(sc.nextLine());
		}
		System.out.println(maxProfit(rt));
	}
}

