import java.util.Scanner;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int array[] = new int[n];
		long sum = 0;
		for(int i=0;i<n;i++){
			array[i] = sc.nextInt();
			sum += array[i];
			sum %= (Math.pow(10,9) + 7);
		}
		long x = 0;
		for(int i=0;i<n;i++){
			sum -= array[i];
			if (sum < 0)
				sum += (Math.pow(10,9) + 7);
			x += array[i] * sum;
			x %= (Math.pow(10,9) + 7);
		}
		System.out.println(x);
		sc.close();
	}
}
