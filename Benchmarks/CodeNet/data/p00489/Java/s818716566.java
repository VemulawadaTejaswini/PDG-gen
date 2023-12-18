import java.util.*;
public Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i, j, c;
		int [] a =  new int[n + 1];
		for(i = 0; i < n * (n - 1) / 2;i++){
			int k = sc.nextInt();
			int l = sc.nextInt();
			int p = sc.nextInt();
			int q = sc.nextInt();
			if (p > q){
				a[k] = a[k] + 3;
				}
			else if(p < q){
				a[l] = a[l] + 3;
				}
			else{
				a[k] = a[k] + 1;
				a[l] = a[l] + 1;
				}
			}
		for(i = 1; i < n + 1; i++){
			c = 1;
			for(j = 0; j < n + 1; j++){
				if(a[i] < a[j])
					c = c + 1;
				}
			System.out.println(c);
			}
		}
	}