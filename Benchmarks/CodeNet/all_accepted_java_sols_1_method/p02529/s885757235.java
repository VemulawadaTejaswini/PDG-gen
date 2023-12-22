import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		int S[] = new int[n];
		for (int i = 0; i < n; i++){
			S[i] = scan.nextInt();
		}
		
		
		int cnt = 0;
		
		int q = scan.nextInt();
		int T[] = new int[q];
		for (int i = 0; i < q; i++){
			T[i] = scan.nextInt();
			
			for (int j = 0; j < n; j++){
				if (T[i] == S[j]){
					cnt++;
					break;
				}
			}
		}
		System.out.println(cnt);
	}
}