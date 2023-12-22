import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		char[] arr = sc.next().toCharArray();
		ArrayList<Integer> list = new ArrayList<>();
		boolean type = (arr[0] == '1');
		boolean first = type;
		int count = 1;
		for (int i = 1; i < n; i++) {
		    if (type == (arr[i] == '1')) {
		        count++;
		    } else {
		        list.add(count);
		        type ^= true;
		        count = 1;
		    }
		}
		list.add(count);
		int length = list.size();
		int[] sums = new int[length + 1];
		for (int i = 0; i < length; i++) {
		    sums[i + 1] = sums[i] + list.get(i);
		}
		int max = 0;
		int left;
		int right;
		if (!first) {
		    max = sums[Math.min(length, k * 2)];
		    left = 2;
		    right = Math.min(length, left + k * 2);
		} else {
		    left = 1;
		    right = Math.min(length, left + k * 2);
		}
		while (left <= right) {
		    max = Math.max(max, sums[right] - sums[left - 1]);
		    left += 2;
		    right = Math.min(length, right + 2);
		}
		System.out.println(max);
    }
}

