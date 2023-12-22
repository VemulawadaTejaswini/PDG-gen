import java.util.Scanner;

class Main {
	public static void main(String[] $) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt(),max=Integer.MIN_VALUE;
		int[] a=new int[100003];
		for(int i=0;i<n;i++) {
			int buff=sc.nextInt();
			if(buff!=0)a[buff-1]++;
			a[buff]++;
			a[buff+1]++;
		}
		for(int i=0;i<100003;i++) {
			max=Math.max(max, a[i]);
		}

		System.out.println(max);
	}
}

