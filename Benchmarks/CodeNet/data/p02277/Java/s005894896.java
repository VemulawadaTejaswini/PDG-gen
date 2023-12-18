import java.util.Scanner;


public class Main{

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int arrayCnt = new Integer(s.nextLine()).intValue();
		String[][] arrayQuick = new String[arrayCnt][2];
		String[][] arrayMerge = new String[arrayCnt][2];
		for(int i=0 ; i<arrayCnt ; i++) {
			arrayQuick[i] = s.nextLine().split(" ");
			arrayMerge[i] = arrayQuick[i];
		}
		boolean flg = false;
		quickSort(arrayQuick, 0, arrayCnt-1);
		sort(arrayMerge, 0 , arrayCnt-1);
		for(int i=0 ; i<arrayCnt ; i++) {
			if(arrayQuick[i][0]!=arrayMerge[i][0])
				flg = true;
		}
		if(flg)
			System.out.println("Not stable");
		else
			System.out.println("Stable");

		for(int i=0 ; i<arrayQuick.length ; i++) {
			System.out.println(arrayQuick[i][0] + " " + arrayQuick[i][1]);
		}
	}

	public static void quickSort(String[][] array, int start, int end) {
		if(start < end) {
			int mid = partition(array, start ,end);
			quickSort(array, start, mid-1);
			quickSort(array, mid+1, end);
		}
	}

	public static int partition(String[][] array, int start ,int end) {
		if(start >= end)
			return -1;
		int index = start;
		for(int i=start ; i<end ; i++) {
			if(new Integer(array[i][1]).intValue() <= new Integer(array[end][1]).intValue()) {
				String[] tmp = array[index];
				array[index] = array[i];
				array[i] = tmp;
				index++;
			}else {

			}
		}
		String[] tmp = array[index];
		array[index] = array[end];
		array[end] = tmp;
		return index;
	}

	public static int sort(String[][] array, int start, int end) {
		int c = 0;
		if(start < end){
			int mid = (start+end)/2;
			c += sort(array, start, mid);
			c += sort(array, mid+1, end);
			c += merge(array, start, end);
		}
		return c;
	}

	public static int merge(String[][] array, int start, int end) {
		int cnt = 0;
		int mid = (start+end) / 2;
		String[][] left = new String[mid-start+2][2];
		String[][] right = new String[end-mid+1][2];
		for(int i=0 ; i<left.length-1 ; i++) {
			left[i] = array[start+i];
		}
		for(int j=0 ; j<right.length-1 ; j++) {
			right[j] = array[mid+j+1];
		}
		int l = 0;
		int n = 0;
		left[mid-start+1][0] = "S";
		left[mid-start+1][1] = Integer.MAX_VALUE+"";
		right[end-mid][0] = "S";
		right[end-mid][1] = Integer.MAX_VALUE+"";
		for(int k=0 ; k<left.length+right.length-2 ; k++) {
			if(new Integer(left[l][1]).intValue() > new Integer(right[n][1]).intValue()) {
				array[start] = right[n];
				n++;
			}else{
				array[start] = left[l];
				l++;
			}
			cnt++;
			start++;
		}
		return cnt;
	}
}