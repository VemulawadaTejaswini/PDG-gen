import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
		    arr[i] = sc.nextInt();
		}
		boolean isFirst = true;
		boolean isInc = true;
		int min = arr[0];
		int max = arr[0];
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 1; i < n; i++) {
		    if (isFirst) {
		        if (arr[i - 1] < arr[i]) {
		            list.add(arr[i - 1]);
		            isFirst = false;
		        }
		    } else {
		        if (isInc) {
		            if (arr[i - 1] > arr[i]) {
		                list.add(arr[i - 1]);
		                isInc = false;
		            }
		        } else {
		            if (arr[i - 1] < arr[i]) {
		                list.add(arr[i - 1]);
		                isInc = true;
		            }
		        }
		    }
		}
		if (list.size() % 2 == 1) {
		    list.add(arr[n - 1]);
		}
		long money = 1000;
		long stock = 0;
		for (int i = 0; i < list.size(); i++) {
		    if (i % 2 == 0) {
		        stock = money / list.get(i);
		        money %= list.get(i);
		    } else {
		        money += stock * list.get(i);
		    }
		}
		System.out.println(money);
	}
}
