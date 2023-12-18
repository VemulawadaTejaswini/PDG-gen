import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int a[] = new int[10000];
		int b[] = new int[10000];
		for(int i = 1; i <= n*(n-1)/2; i++){
			for(int h = 1; h <= 4; h++){
				b[h] = in.nextInt();
			}
			if(b[3] > b[4]){
				a[b[1]] += 3;
			}else if(b[3] < b[4]){
				a[b[2]] += 3;
			}else if(b[3] == b[4]){
				a[b[1]] += 1;
				a[b[2]] += 1;
			}
		}
		for(int j = 1; j <= n; j++){
			int an = n;
			for(int k = 1; k <= n; k++){
				if(j == k){
					continue;
				}else if(a[j] >= a[k]){
					an--;
				}
			}
			System.out.println(an);
		}
	}

}