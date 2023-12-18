

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		Scanner scn  = new Scanner(System.in);
		int[] arr = new int[5];
		for(int i=0;i<5;i++) {
			arr[i] = scn.nextInt();
		}
		for(int i=0;i<5;i++) {
			if(arr[i]==0) {
				System.out.println(i+1);
				break;
			}
		}

	}

}
