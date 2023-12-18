import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class SortedArray {
	private int[] array;
	private int pointer=0;

	//コンストラクタ
	public SortedArray(int[] a){
		array = new int[a.length];
		for (int i:a) add(i);
	}

	public void add(int i) {
		//System.out.print("Array::::::::");for (int aa:array) System.out.print(aa+"  "); System.out.println();
		if (pointer>0) {
			if (array[pointer-1]<=i) {
				array[pointer] = i;
			} else {
				int lb = lowerBound(i);
				int[] a = new int[pointer+1];
				if (lb != 0)for (int j=0; j<lb; j++) a[j] = array[j];
				a[lb] = i;
				for (int j=lb+1; j<pointer+1; j++) a[j] = array[j-1];
				for (int j=0; j<=pointer; j++) array[j] = a[j];
			}
		} else array[0] = i;
		pointer++;
	}

	private int lowerBound(int target) {
		int low = 0;
		int high = pointer-1;  //最後

		while (low < high) {
			int mid = (high + low)/2;
			if (array[mid] == target) {
				return mid;
			}
			else if (array[mid] < target) low = mid + 1;
			else high = mid;
		}
		return high;
	}

	//---------------------------------------------

	public int[] getArray() { return array; }
}

class Main {


	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)){
			int n = sc.nextInt();
			int number = sc.nextInt(); //枚数
			int no = sc.nextInt();  //何番目
			int[] cards = new int[n];
			List<Integer> result = new ArrayList<Integer>();
			for (int i=0; i<n; i++) cards[i] = sc.nextInt();

			for (int i=number; i<= n; i++) {
				int start = 0;
				while (start + i <= n) {
					int[] copy = new int[i];
					System.arraycopy(cards,start,copy,0,i);
					//System.out.print("copy::::::::::"); for (int j:copy) System.out.print(j+" ");System.out.println("");
					SortedArray sa = new SortedArray(copy);
					//for (int j:sa.getArray())  System.out.print(j+" ");System.out.println("");
					result.add(sa.getArray()[number-1]);
					start++;
				}
			}
			Integer[] r = new Integer[result.size()];
			result.toArray(r);
			Arrays.sort(r);
			System.out.println(r[no-1]);
		}
	}
}

