import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] array = new int[N];
		for(int i=0;i<N;i++) {
			array[i] = sc.nextInt();
		}
		for(int k=0;k<N;k++) {
			if(k!=N-1) {
				System.out.print(array[k]+" ");
			}else {
				System.out.print(array[k]);
			}
		}
		System.out.println();

		for(int i=1;i<N;i++) {
			int v = array[i];
			int j = i-1;
			while(j>=0 && array[j] > v) {
				array[j+1] = array[j];
				j--;
				array[j+1] = v;
			}
			for(int k=0;k<N;k++) {
				if(k!=N-1) {
					System.out.print(array[k]+" ");
				}else {
					System.out.print(array[k]);
				}
			}

			/*if(i!=N-1)*/System.out.println();
		}




	}
}

