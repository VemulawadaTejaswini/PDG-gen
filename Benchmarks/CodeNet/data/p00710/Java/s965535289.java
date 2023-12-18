import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n, r, p, c;
		int[] x, y;
		while(true){
			n = sc.nextInt();
			r = sc.nextInt();
			if(n == 0 && r == 0)
				break;
			else if(n < 1 || n > 50 || r < 1 || r > 50){
				System.out.println("Error");
				continue;
			}
			else{
				x = new int[n];
				y = new int[n];
				for(int i = 0; i < n; i++)
					x[i] = n - i;
				for(int i = 0; i < r; i++){
					while(true){
						p = sc.nextInt();
						c = sc.nextInt();
						if(p + c <= n + 1)
							break;
						else
							System.out.println("Error");
					}
					shuffle(x, y, n, r, p, c);
				}
			}
			System.out.println(x[0]);
		}
	}
	static void shuffle(int[] x, int[] y, int n, int r, int p, int c){
		for(int i = 0; i < p+c-1; i++)
			y[(i+c)%(p+c-1)] = x[i];
		for(int i = 0; i < p+c-1; i++)
			x[i] = y[i];
	}
}