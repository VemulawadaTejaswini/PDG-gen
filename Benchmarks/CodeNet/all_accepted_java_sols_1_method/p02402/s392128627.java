import java.util.Scanner;

class Main{
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		//??\????????£?¨?
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] hako = new int[n];
		long sum = 0;
		int max = -1000000;
		int min = 1000000;

		for(int i = 0; i < n; i++){
			hako[i] = scan.nextInt();
			sum = sum + hako[i];
		}
		
		//??\?????????

		for (int i=0; i<hako.length; i++) {
			if (max < hako[i]) {
				max = hako[i];
			}
			if (min > hako[i]) {
				min = hako[i];
			}
		}
		 
		//??????
		System.out.println(min + " " + max + " " + sum);
	}
}