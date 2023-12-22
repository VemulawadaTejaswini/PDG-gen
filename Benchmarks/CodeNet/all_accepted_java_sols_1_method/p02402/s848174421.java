import java.util.Scanner;
 class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a =new int[n];
		long sum;
		int i, min, max;
		for(i=0; i<n; i++) {
			a[i]= sc.nextInt();
		}
		
		sum = 0;
		min = a[0];
		max = a[0];
		for(i=0; i<n; i++) {
			if(a[i]<min)	min=a[i];
			else if(a[i]>max)	max=a[i];
			sum += a[i];
		}
		System.out.println(min + " " + max + " " + sum);
	}
}
