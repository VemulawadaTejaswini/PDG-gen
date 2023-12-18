import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int flag = 1;
		long temp=0;
		int count=0;
		long[] array = new long[n];

		for(int i=0;i<n;i++) {
			array[i]=sc.nextLong();

		}
		while(flag==1) {
			flag = 0;
			for(int i=n-1;i>=1;i--) {
				if(array[i]< array[i-1]) {
					temp = array[i];
					array[i] = array[i-1];
					array[i-1] = temp;
					flag = 1;
					count++;
				}
			}
		}

		for(int i=0;i<n;i++) {
			if(i!=n-1) {
				System.out.print(array[i] + " ");
			}else {
				System.out.println(array[i]);
			}
		}

		System.out.println(count);

	}

	public static long max(long[] array,int j) {
		long temp,max=-9999999;
		for(int i=j+1;i<array.length;i++) {
			temp = array[i] - array[j];
			if(temp > max) {
				max = temp;
			}
		}
		return max;
	}
}

