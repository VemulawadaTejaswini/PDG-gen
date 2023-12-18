import java.util.*;

public class Main {
    static final int MOD = 1000000007;
 	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] arr = sc.next().toCharArray();
		int length = arr.length;
		int[] counts = new int[length];
		boolean isRight = true;
		int rightCount = 0;
		for (int i = 0; i < length; i++) {
		    if (isRight) {
		        if (arr[i] == 'R') {
		            rightCount++;
		        } else {
		            counts[i] += rightCount / 2;
		            counts[i - 1] += rightCount - rightCount / 2;
		            isRight = false;
		            rightCount = 0;
		        }
		    } else {
		        if (arr[i] == 'R') {
		            isRight = true;
		            rightCount++;
		        }
		    }
		}
		boolean isLeft = true;
		int leftCount = 0;
		for (int i = length - 1; i >= 0; i--) {
		    if (isLeft) {
		        if (arr[i] == 'L') {
		            leftCount++;
		        } else {
		            counts[i] += leftCount / 2;
		            counts[i + 1] += leftCount - leftCount / 2;
		            isLeft = false;
		            leftCount = 0;
		        }
		    } else {
		        if (arr[i] == 'L') {
		            isLeft = true;
		            leftCount++;
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


