import java.util.Scanner;

class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n, m;
		int[] bag;
		int p;
		int v, j;
		int ans;
		
		while(true){
			n = scan.nextInt();
			m = scan.nextInt();
			if(n == 0 && m == 0)break;
			
			bag = new int[n];
			ans = 0;
			for(int i = 0; i < n; i++){
				p = scan.nextInt();
				bag[i] = p;
			}
			
			v = 0;
			j = 0;
			for(int i = 1; i <= n - 1; i++){
				v = bag[i];
				j = i - 1;
				while(j >= 0 && bag[j] < v){
					bag[j + 1] = bag[j];
					j--;
				}
				bag[j + 1] = v;
			}
			
			for(int i = 0; i <= n/m; i++){
				if(i != 0)
				bag[i * m - 1] = 0;
			}
			for(int i = 0; i < n; i++){
				ans += bag[i];
			}
			System.out.println(ans);
		}
	}
}