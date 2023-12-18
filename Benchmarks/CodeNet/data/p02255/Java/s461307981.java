import java.util.Scanner;
class Sort {
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
				int n=x.nextInt();
		int[] a = new int [n];
		for(int i=0;i<a.length;i++) {
			a[i] = x.nextInt();
			System.out.print(a[i]);
			if(i < a.length -1) {
				System.out.print(" ");
			}	}
		System.out.println();
		for(int i=1;i<a.length;i++) {
			int v = a[i];
			int j = i - 1;
			while( (j >= 0) && a[j] > v) {
				a[j+1] = a[j];
				j--;
				a[j+1] = v;
			}
			for(int k=0;k<a.length;k++) {
				System.out.print(a[k]);
				if(k < a.length - 1) {
					System.out.print(" ");
				}
				if(k >= a.length - 1) {
					System.out.println();
				}
			}
		}
	}

}

