import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		while(n != 0){
			int max = 0;
			int min = 0;
			int array[] = new int[n];

			for(int i = 0; i < n; i++){
				array[i] = sc.nextInt();
				if(array[i] > array[max]){
					max = i;
				}
				else if(array[min] > array[i]){
					min = i;
				}
			}
			int sum = 0;
			//calc adv.
			for(int i = 0; i < n; i++){
				if(i != max && i != min){
					sum += array[i];
				}
			}
			double adv = sum / (n - 2);
			int ans = (int)adv;
			System.out.println(ans);
			n = sc.nextInt();
		}

	}
}