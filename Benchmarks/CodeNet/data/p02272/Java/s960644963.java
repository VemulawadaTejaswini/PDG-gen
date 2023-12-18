import java.util.Scanner;

public class Main {

	public static final int SENTINEL = 2000000000;
	static int[] MERGETMPA;
	static int[] MERGETMPB;
	static int[] S;
	static int count = 0;

	public static void main(String[] args) throws Exception {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();

		MERGETMPA = new int[n / 2 + 2];
		MERGETMPB = new int[n / 2 + 2];
		S = new int[n];
		for(int i = 0 ; i < n ; i++) S[i] = input.nextInt();
		mergeSort(0,n);
		input.close();
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < S.length ; i++){
			sb.append(String.valueOf(S[i]));
			sb.append(" ");
		}
		System.out.println(sb.toString().trim());
		System.out.println(count);
	}


	public static void mergeSort(int left,int right){
		if(right - left > 1){
			int mid = (right + left) / 2;
			mergeSort(left,mid);
			mergeSort(mid,right);
			merge(left,mid,right);
		}
	}

	public static void merge(int left,int mid,int right){
		int i = 0;
		int s = left;
		for(i = 0 ; i < mid - left ; i++) MERGETMPA[i] = S[s++];
		MERGETMPA[i] = SENTINEL;
		s = mid;
		for(i = 0 ; i < right - mid ; i++) MERGETMPB[i] = S[s++];
		MERGETMPB[i] = SENTINEL;

		int x = 0;
		int y = 0;
		for(i = left ; i < right; i++){
			count++;
			if(MERGETMPA[x] <= MERGETMPB[y]){
				S[i] = MERGETMPA[x];
				x++;
			}else{
				S[i] = MERGETMPB[y];
				y++;
			}
		}

	}

}