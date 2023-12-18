import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int num[] = new int[n];

		for(int i=0; i<n; i++) num[i]=sc.nextInt();
		if(n!=1) sort(num, 0, n-1);
		for(int i=0; i<n-1; i++) System.out.print(num[i]+" ");
		System.out.println(num[n-1]);
	}

	static void sort(int[] num, int l, int r){
		double pivot = pivot(num, l, r);
		int left_end = l, right_end = r;
		int temp;

		if(pivot!=-1){
			while(l<=r){
				while(num[l]<pivot && l<=right_end) l++;
				while(num[r]>=pivot && r>=left_end) r--;
				if(l>r) break;
				temp = num[l];
				num[l] = num[r];
				num[r] = temp;
			}
			if(left_end!=r) sort(num, left_end, r);
			if(right_end!=l) sort(num, l, right_end);
		}
	}

	static double pivot(int[] num, int l, int r){
		int temp = 0;
		int flag = 0;

		for(int i=l; i<=r; i++){
			temp += num[i];
			if(num[l]==num[i]) flag++;
		}
		if(flag!=r-l+1){
			return (double)temp/(r-l+1);
		}else{
			return -1;
		}
	}
}