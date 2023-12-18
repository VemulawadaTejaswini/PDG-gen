import java.util.Scanner;
public class Main {
	public static int search(int[] a,int key,int n){
		int left = 0;
		int right = n;
		int mid = 0;
		while(left<right){
			mid = (left + right)/2;
			if(a[mid]==key)
				return 1;
			else if(key<a[mid])
				right = mid;
			else
				left = mid +1;
		}
		return 0;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int result=0;
		int n = scan.nextInt();
		int[] S = new int[n+1];
		for(int i = 0 ; i < n ; i ++){
			S[i]=scan.nextInt();
		}
		int q = scan.nextInt();
		int[] T = new int[q];
		for(int i = 0 ; i < q ; i ++){
			T[i]=scan.nextInt();
		}
		for(int i = 0; i < q ; i ++){
			result += search(S,T[i],n);	
		}
		System.out.println(result);
		scan.close();
	}

}