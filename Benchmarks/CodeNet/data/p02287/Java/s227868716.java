import java.util.Scanner;

public class Main {
	
	public static void printBST(int[] arr) {
		int i = 1;
		while(i < arr.length) {
			System.out.print("node " + i + ": key = " + arr[i] + ",");
			if(i > 1) {
				System.out.print(" parent key = " + arr[i/2] + ", ");
				if(i * 2 < arr.length) {
					System.out.print("left key = " + arr[i * 2] + ", ");
				}
				if(i * 2 +1 < arr.length) {
					System.out.print("right key = " + arr[i * 2 + 1] + ", ");
				}
			}
			else {
				if(arr.length > 3) {
					System.out.print(" left key = " + arr[i*2] + ", right key = " + arr[i * 2 + 1] + ", ");
				}
				else {
					
				}
			}
			System.out.println();
			i++;
		}
		
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int sizeOfArray = in.nextInt();
		int[] arr = new int[sizeOfArray + 1];
		arr[0] = 0;
		for(int i = 1; i < arr.length; i++) {
			arr[i] = in.nextInt();
		}
		in.close();
		printBST(arr);
	}
}

