import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int count = 0 ;
	    int arr[] = new int[n];
	    int arr2[] = new int[n];
	    for(int  i = 0 ; i < n ; i ++) {
	    	arr[i] = scan.nextInt();
	    }
	    for(int  i = 0 ; i < n ; i ++) {
	    	arr2[i] = scan.nextInt();
	    }
	    int sum = 0 ;
	    for(int i = 0 ; i < n ; i++) {
	    	if(arr[i] - arr2[i] >0) {
	    		sum+= arr[i] - arr2[i];
	    	}
	    }
	    System.out.println(sum);
	}
}	