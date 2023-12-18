import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	    	Scanner sc = new Scanner(System.in);
	    	int n = sc.nextInt();
	    	int[] a = new int[n];
	    	int[] b = new int[n];
	    	long aSum = 0;
	    	long bSum = 0;
	    	long downCount = 0;
	    	long upSum = 0;
	    	long downSum = 0;
	    	long ansCount = 0;
	    	List<Integer> upList = new ArrayList<>();
	    	for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			aSum += a[i];
		}
	    	for (int i = 0; i < n; i++) {
			b[i] = sc.nextInt();
			bSum += b[i];
			if (a[i] - b[i] >= 0) {
				upList.add(a[i]- b[i]);
				upSum += a[i] - b[i];
			} else {
				downCount++;
				downSum += (b[i] - a[i]);
			}
		}
	    	Collections.sort(upList, Comparator.reverseOrder());
	    	if (downCount == 0) {
	    		System.out.println(0);
	    		return;
	    	}
	    	if (upSum < downSum) {
	    		System.out.println(-1);
	    		return;
	    	}
	    	for (Integer integer : upList) {
			downSum -= integer;
			ansCount++;
			if (downSum <= 0) {
				System.out.println(ansCount+downCount);
				return;
			}
		}
	}
}
