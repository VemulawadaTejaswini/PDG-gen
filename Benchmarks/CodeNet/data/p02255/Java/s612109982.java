import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int[] array = new int[x];

		for(int i=0;i<x;i++) {
			array[i] = sc.nextInt();
		}

		show(array, x);
		insertionSort(array, x);

		sc.close();
	}

	public static void show(int[] array, int x) {
		for(int i=0;i<x;i++) {
			System.out.print(array[i]);
			if(i!=x-1) {
				System.out.print(" ");
			}
		}
		System.out.println();
	}

	public static void insertionSort(int[] array, int x) {
		int j,i,v;
		for(i=1;i<x;i++) {
			v=array[i];
			j=i-1;
			while(j>=0 && array[j]>v) {
				array[j+1] = array[j];
				j--;
			}
			array[j+1]=v;
			show(array,x);
		}
	}
}
