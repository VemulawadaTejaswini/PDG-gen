import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			int r = sc.nextInt();
			if(n == 0 && r == 0) break;
			int[] hf = new int[n];
			for(int i = 0; i < n; i++){
				hf[i] = n-i;
			}
			for(int i = 0; i < r; i++){
				int p = sc.nextInt();
				int c = sc.nextInt();
				int[] next = new int[p+c-1];
				for(int j = 0; j < c;j++){
					next[j] = hf[p-1+j];
				}
				for(int j = c; j < p+c-1; j++){
					next[j] = hf[j-c];
				}
				for(int j = 0; j < p+c-1; j++){
					hf[j] = next[j];
				}
			}
			System.out.println(hf[0]);
		}
	}
}