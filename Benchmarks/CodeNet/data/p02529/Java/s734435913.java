import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int cnt = 0;
		int[] S = new int[100];
		int[] T = new int[100];
		int n = scan.nextInt();
		for(int i = 0; i < n;i++){
			S[i] = scan.nextInt();
		}
		int q = scan.nextInt();
		for(int i = 0; i < q;i++){
			T[i] = scan.nextInt();
		}
		for(int i = 0; i < q; i++){
			for(int j = 0; j < n; j++){
				if(T[i] == S[j]){
					cnt++;
					break;
				}
			}
		}
		System.out.println(cnt);
	}
}