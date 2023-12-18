

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int x,y,n,j;
		x = scan.nextInt();
		n = scan.nextInt();
		
		int[] ary = new int[n];
		
		for(int i=0;i<n;i++) {
			ary[i] = scan.nextInt();
		}
		
		Arrays.sort(ary);
		j = 0;
		
		while(true) {
			if(Arrays.binarySearch(ary, x-j) < 0) {
				y = x-j;
				break;
			}else if(Arrays.binarySearch(ary, x+j) < 0) {
				y = x+j;
				break;
			}else {
				j++;
				continue;
			}
		}
		System.out.println(y);
	}

}
