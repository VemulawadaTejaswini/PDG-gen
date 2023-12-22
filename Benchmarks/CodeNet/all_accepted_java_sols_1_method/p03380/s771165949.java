import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int max = 0;
		for (int i = 0; i < n; i++) {
		    arr[i] = sc.nextInt();
		    max = Math.max(max, arr[i]);
		}
		int maxValue = -1;
		int maxNum = 0;
		for (int i = 0; i < n; i++) {
		    if (arr[i] == max) {
		        continue;
		    }
		    int value = Math.min(arr[i], max -arr[i]);
		    if (maxValue < value) {
		        maxValue = value;
		        maxNum = arr[i];
		    }
		}
	    System.out.println(max + " " + maxNum);
   }
}


