import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char[] arr = sc.next().toCharArray();
		int d = sc.nextInt();
		int nd = n - d;
		for (int i = 0; i < n; i++) {
		    if (arr[i] == '1') {
		        if (nd > 0) {
		            nd--;
		        } else {
		            arr[i] = '0';
		            d--;
		        }
		    } else {
		        if (d > 0) {
		            d--;
		            arr[i] = '1';
		        } else {
		            nd--;
		        }
		    }
		}
		System.out.println(arr);
	}
}

