import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] arr = sc.next().toCharArray();
		int length = arr.length;
		int[] counts = new int[length];
		for (int i = 0; i < length; i++) {
		    if (arr[i] == 'L') {
		        for (int j = i - 1; j >= 0 && arr[j] == 'R'; j--) {
		            if ((i - j) % 2 == 0) {
		                counts[i]++;
		            } else {
		                counts[i - 1]++;
		            }
		        }
		    }
		    if (arr[length - i - 1] == 'R') {
		        for (int j = length - i; j < length && arr[j] == 'L'; j++) {
		            if ((j - (length - i - 1)) % 2 == 0) {
		                counts[length - i - 1]++;
		            } else {
		                counts[length - i]++;
		            }
		        }
		    }
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < length; i++) {
		    if (i != 0) {
		        sb.append(" ");
		    }
		    sb.append(counts[i]);
		}
		System.out.println(sb);
   }
}
