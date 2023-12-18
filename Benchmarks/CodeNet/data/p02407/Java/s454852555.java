package package6;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

			int[] A=new int[100];

			Scanner scan = new Scanner(System.in);
			int n = scan.nextInt();

			for(int i = 0;i < n;i++){
				A[i] = scan.nextInt();
			}
			for(int i = n-1;i >= 0;i--){
				if(i != n-1){
					System.out.print(" ");
				}
				System.out.print(A[i]);
			}
			System.out.println();
		}
	}