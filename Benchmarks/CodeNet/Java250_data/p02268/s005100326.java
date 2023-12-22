import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int S[] = new int[n];
		int i;
		for(i=0; i<n; i++){
			S[i] = sc.nextInt();
		}
		int q = sc.nextInt();
		int T[] = new int[n];
		int j;
		for(j=0; j<q; j++){
			T[j] = sc.nextInt();
		}
		int C=0;
		int left, right, mid;
		for(j=0; j<q; j++){
			left = 0;
			right = n;
			while(left < right){
				mid = (left + right) / 2;
				if(T[j] == S[mid]){
					C++;
					break;
				} else if(T[j] < S[mid]){
					right = mid;
				} else{
					left = mid + 1;
				}
			}
		}
		System.out.println(C);
	}
}