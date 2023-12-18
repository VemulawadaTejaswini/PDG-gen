import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		while(true){
			int count = 0;
			int n = in.nextInt();
			int[]S = new int [1000001];
			int[]T = new int [1000001];
			int a = in.nextInt();
			int b = in.nextInt();
			int c;
			if(n + a + b == 0) break;
			int idx;
			if(a > b){
				c = a;
				a = b;
				b = c;
			}
			T[0] = a;
			T[1] = b;
			int i = 2;
			while(true){
				i++;
				for(int j = 0;j < i;j++){
					if(j < i-1){
						T[j] = T[j] + a;
						if(T[j] > n){
							i = j;
							break;
						}
						S[T[j]] = 1;
					}else {
						T[j] = T[j] + b;
						if(T[j] > n){
							i = j;
							break;
						}
						S[T[j]] = 1;
					}
				}
				if(T[0] > n) break;
			}
			for(int k = 0;k <= n;k++){
				count = count + S[k];
			}
			count = n - count -1;
			System.out.println(count);
		}
	}
}