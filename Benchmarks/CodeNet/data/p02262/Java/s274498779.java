import java.util.Scanner;
public class Main {
	static int cnt;
	
	public static void insertSort(int [] arr, int n, int g) {
		for(int i = g; i < n; i++) {
			int v = arr[i];
			int j = i - g;
			
			while(j >= 0 && arr[j] > v) {
				arr[j + g] = arr[j];
				j = j - g;
				cnt++;
			}
			
			arr[j + g] = v;
		}
	}
	
	public static void shell(int [] arr, int n) {
		int m = 0; 
		int s = 1;
		
		while((n/s) > 0) {
			s *=2;
			m++;
		}
		
		int [] G = new int [100];
		
		for(int k = 0,t = 1; k < m; k++){
			G[k] = n/t;
			t *= 2;
		}

		for(int i = 0; i < m;i++){
			insertSort(arr ,n, G[i]);
		}
		
		System.out.println(m);
		
		for(int i = 0; i < m; i++){
			if(i != m-1){
				System.out.print(G[i] + " ");
			}else{
				System.out.print(G[i] + "\n");
			}
		}
		System.out.print(cnt + "\n");
		
		for(int i = 0; i < n; i++){
			System.out.println(arr[i]);
		}
	}
	
	
	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		
		int [] arr = new int [n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}
		
		shell(arr, n);
		
		
	}

}

