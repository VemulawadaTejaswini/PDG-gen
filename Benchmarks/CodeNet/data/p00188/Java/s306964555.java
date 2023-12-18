import java.util.*;

public class Main{
	int count;
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			if(n == 0) break;
			int [] data = new int[n];
			for(int i = 0; i < n; i++){
				data[i] = sc.nextInt();
			}
			int num = sc.nextInt();
			count = 0;
			int res = binarySearch(data, num);
			System.out.println(count);
		}
	}
	
	private int binarySearch(int [] a, int patt){
		int mid, left = 0, right = a.length-1;
		while(left <= right){
			mid = (left + right) / 2;
			count++;
			if(a[mid] == patt){
				return mid;
			}
			if(a[mid] < patt){
				left = mid + 1;
			}
			else{
				right = mid - 1;
			}
		}
		return -1;
	}

	private void debug(Object... o) { System.out.println("debug = " + Arrays.deepToString(o)); }

	public static void main(String[] args) {
		new Main().doit();
	}
}