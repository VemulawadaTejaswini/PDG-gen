import java.util.Scanner;
import java.util.Random;
import java.io.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int length1 = scanner.nextInt();
		int[] arr1 = new int[length1];
		
		for(int i=0;i<length1; i++) {
			arr1[i] = scanner.nextInt();
		}
		
		int length2 = scanner.nextInt();
		int[] arr2 = new int[length2];
		
		for(int i=0;i<length2; i++) {
			arr2[i] = scanner.nextInt();
		}
		//Binary Search
		int count = 0;
		for(int i=0; i<length2; i++) {
			int left = 0;
			int right = length1 -1;
			
			Boolean cont = true;
			while(left <= right && cont == true) {
				int mid = (left +right)/2;
				
				if(arr2[i]==arr1[mid]) {
					count++;
					cont = false;}
				if(arr2[i] > arr1[mid])
					left = mid + 1;
				if(arr2[i] < arr1[mid])
					right = mid - 1;
			}
			
		}
		System.out.println(count);
		
	}
}
