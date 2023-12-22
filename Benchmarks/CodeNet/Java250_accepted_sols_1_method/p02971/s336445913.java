import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size= sc.nextInt();
		int largest = 1;
		int second  = 0;
		int[] arr = new int[size];
		for(int i = 0;i<size;i++) {
			arr[i]=sc.nextInt();
			if(arr[i]>largest)largest=arr[i];
			else if(arr[i]>second)second = arr[i];
		}
		for(int i = 0;i<size;i++) {
			if(arr[i]==largest)System.out.println(second);
			else System.out.println(largest);
		}
		
	}
}
