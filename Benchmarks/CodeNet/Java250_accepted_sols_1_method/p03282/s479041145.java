import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] arr = sc.next().toCharArray();
		long k = sc.nextLong();
		int max = arr.length;
	    char first = '1';
	    for (int i = 0; i < arr.length; i++) {
	        if (arr[i] != '1') {
	            max = i;
	            first = arr[i];
	            break;
	        }
	    }
	    if (max >= k) {
	        System.out.println(1);
	    } else {
	        System.out.println(first);
	    }
	}
}
