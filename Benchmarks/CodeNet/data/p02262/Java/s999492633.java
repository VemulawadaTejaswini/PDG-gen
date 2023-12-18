import java.util.Scanner;
class Main {
   public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		int[] num = new int[input];
		
		for(int i = 0; i < input; i++){
			num[i] = scan.nextInt();
		}
		
		shellSort(num, input);
		
		for(int n = 0; n < input; n++){
			System.out.println(num[n]);
		}
	}
	
	static int insertionSort(int A[], int n, int g){
		int v;
		int j;
		int c = 0;
		
		for(int i = g; i <= n - 1; i++){
			v = A[i];
			j = i - g;
			while(j >= 0 && A[j] > v){
				A[j + g] = A[j];
				j = j - g;
				c++;
			}
			A[j + g] = v;
		}
		return c;
	}
	
	static void shellSort(int A[], int n){
		int cnt = 0;
		int m = 0;
		int h = 1;
		
		while(h < n){
			h = h * 3 + 1;
			m++;
		}
		System.out.println(m);
		int[] G = new int[m];
		
		int temp = 0;
		for(int j = 0; j < m; j++){
			for(int i = 0; i < m - j; i++){
				temp = temp * 3 + 1;
				G[j] = temp;
				
			}
			if(j != m - 1){
				System.out.print(G[j] + " ");
			}else{
				System.out.println(G[j]);
			}
			temp = 0;
		}
		for(int i = 0; i <= m - 1; i++){
			cnt += insertionSort(A, n, G[i]);
		}
		
		System.out.println(cnt);
	}
}