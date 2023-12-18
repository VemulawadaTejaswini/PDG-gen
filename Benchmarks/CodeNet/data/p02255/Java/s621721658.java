package pA;

import java.util.Scanner;

public class Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* initial */
		
		System.out.println("input length");
		Scanner scanner = new Scanner(System.in);
		int length = scanner.nextInt(); 
		
		int[] elem = null;
		
		for(int i = 0;i < length;i++){
			elem[i] = scanner.nextInt();
		}
		/* function */
		for(int i = 1;i<length;i++){
			int key = elem[i];
			int j = i - 1;
			
			while( j > 0 && elem[j] > key){
				elem[j+1] = elem[j];
				j = j -1;
				elem[j+1] = key;
				
			}
			
		}

	}

}

