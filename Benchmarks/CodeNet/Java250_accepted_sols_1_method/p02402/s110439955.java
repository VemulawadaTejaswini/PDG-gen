import java.util.*;

class Main{
	public static void main(String args[]){
		int num, max, min;
		long sum = 0;
		Scanner scan = new Scanner(System.in);
		num = scan.nextInt();
		int[] arr = new int[num];

		for(int i=0; i<num; i++) {
			arr[i] = scan.nextInt();
			sum += arr[i];
		}

		Arrays.sort(arr);
		min = arr[0];
		max = arr[num-1];

		System.out.printf("%d %d %d\n", min, max, sum);
	}
}