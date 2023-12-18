import java.util.Scanner;

public class Main {
	int a[] = new int[10000];
	int b[] = new int[10000];
	public void score(int c1, int c2, int c3, int c4){
		if(c3 > c4){
			a[c1] += 3;
		}else if(c3 < c4){
			a[c2] += 3;
		}else if(c3 == c4){
			a[c1] += 1;
			a[c2] += 1;
		}
	}
	public void rank(int n){
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
	
	void doIt(){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for(int i = 1; i <= n*(n-1)/2; i++){
			for(int h = 1; h <= 4; h++){
				b[h] = in.nextInt();
			}
			score(b[1], b[2], b[3], b[4]);
		}
		rank(n);
	}
		
	
	public static void main(String[] args) {
			new Main() . doIt();
	}
}