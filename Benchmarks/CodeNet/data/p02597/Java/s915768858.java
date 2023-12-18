import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char[] arr = sc.next().toCharArray();
		int left = 0;
		int right = n - 1;
		int count = 0;
		while (true) {
		    while(left < right && arr[left] != 'W') {
		        left++;
		    }
		    while (left < right && arr[right] != 'R') {
		        right--;
		    } 
		    if (left >= right) {
		        break;
		    }
		    count++;
		    left++;
		    right--;
		}
		System.out.println(count);
	}
}
